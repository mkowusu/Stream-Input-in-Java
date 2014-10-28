

/* Program to compute test statistics for students
illustrating several capabilities of the Scanner class
*/

package streamInput;

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class TestScanner3
{
public static void main (String args[])
{   // identify name of file with test information
    String testFile = 
        "/home/owusumic17/CSC 207/test.data";
     
    try  // try needed in case opening FileReader fails
    {
        // set up file reader for given data file
        FileReader fileReaderIn = new FileReader (testFile);
        // use FileReader object to initialize scanner
        Scanner fileIn = new Scanner (fileReaderIn);
          
        // declare variables for reading and for max and min
        int test1 = 0, test1max = 0, test1min = 0;
        int test2 = 0, test2max = 0, test2min = 0;
        int test3 = 0, test3max = 0, test3min = 0;
        boolean firstTime = true;
          
        //print headings
        System.out.println ("      Name                      Test");
        System.out.println ("First    Last\t\t  1 \t  2 \t  3      Average");  

        while (fileIn.hasNext())
        {
           // read subsequent parts of a name 
           // until the first test score is found
            String name = "";
            while (!fileIn.hasNextInt())  /* check if next is int */
            { // next item not an integer, concatenate to name
                name += fileIn.next() + " "; 
            } 

            // add tab if name is short
            if (name.length() < 16)
                name += "\t";

            // retrieve next items as integers
            test1 = fileIn.nextInt(); 
            test2 = fileIn.nextInt();
            test3 = fileIn.nextInt();
           if (firstTime)
              {   // the first data read become 
                  //  initial max and min values
                  test1max = test1min = test1;
                  test2max = test2min = test2;
                  test3max = test3min = test3;
                  firstTime = false;
              }
           else
              {
                  if (test1max < test1)
                      test1max = test1;
                  if (test1min > test1)
                      test1min = test1;
                  if (test2max < test2)
                      test2max = test2;
                  if (test2min > test2)
                      test2min = test2;
                  if (test3max < test3)
                      test3max = test3;
                  if (test3min > test3)
                      test3min = test3;
              }
           // compute average and print results for line
           double avg = (test1 + test2 + test3) / 3.0;
           System.out.printf ("%-17s\t%3d %7d %7d %10.2f\n",
                              name, test1, test2, test3, avg);
      }
        // print concluding maximums and minimums
        System.out.printf ("\nMaximum \t%3d %7d %7d\n",
                               test1max, test2max, test3max);
        System.out.printf ("Minimum  \t%3d %7d %7df\n",
                            test1min, test2min, test3min);
    }
    catch (IOException e)
        {   // identify any error that arises
            System.err.println (e);
        }
}
}