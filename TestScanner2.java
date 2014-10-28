
/* Program to compute test statistics for students
using terminal input
*/

package streamInput;

import java.util.Scanner;

public class TestScanner2
{
public static void main (String args[])
{       // use System.in to initialize scanner
        Scanner fileIn = new Scanner (System.in);
          
        // declare variables for reading and for max and min
        int test1 = 0, test1max = 0, test1min = 0;
        int test2 = 0, test2max = 0, test2min = 0;
        int test3 = 0, test3max = 0, test3min = 0;
        boolean firstTime = true;
          
        //print headings
        System.out.println ("      Name                      Test");
        System.out.println ("First    Last\t\t 1 \t2 \t3      Average");  

        while (fileIn.hasNextLine())
        {
           // read entire line
           String line = fileIn.nextLine();
           // extract name field
           String name = line.substring (0, 18);
           // extract test 1 string and convert to integer
           //     extract character
           String intString = line.substring (19, 24);
           //     trim leading and trailing whitespace
           intString = intString.trim();
           //     convert to int by creating an Integer object
           test1 = new Integer(intString).intValue();

           // extract test 2 string and convert to integer
           intString = line.substring (25, 30);
           intString = intString.trim();
           test2 = new Integer(intString).intValue();
           // extract test 3 string and convert to integer
           intString = line.substring (31).trim();
           test3 = new Integer(intString).intValue();
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
           System.out.println (name + "\t" + test1 
                                    + "\t" + test2 
                                    + "\t" + test3
                                    + "\t" + avg);
        }
        // print concluding maximums and minimums
        System.out.println ("\nMaximum     \t\t" + test1max
                               + "\t" + test2max
                               + "\t" + test3max);
        System.out.println ("Minimum     \t\t" + test1min
                               + "\t" + test2min
                               + "\t" + test3min);
}
}