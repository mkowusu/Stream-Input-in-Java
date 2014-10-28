

/* Program to compute test statistics for students
 */

package streamInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TestBufferedReader1
{
   public static void main (String args[]) throws IOException 
   {   // identify name of file with test information
       String testFile = 
    		   "/home/owusumic17/CSC 207/StreamInput/test.data";
        
      // try  // try needed in case opening File fails
       //{
           // set up file reader for given data file
           FileReader istream = new FileReader (testFile);
           // use FileReader object to initialize scanner
           BufferedReader fileIn = new BufferedReader (istream);
              
           // declare variables for reading and for max and min
           int test1 = 0, test1max = 0, test1min = 0;
           int test2 = 0, test2max = 0, test2min = 0;
           int test3 = 0, test3max = 0, test3min = 0;
           boolean firstTime = true;
              
           //print headings
           System.out.println ("      Name                      Test");
           System.out.println ("First    Last  \t\t 1\t 2\t 3      Average");   

           // read entire first line
           String line = fileIn.readLine();
           while (line != null)
           {
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
              // read entire next line to prepare for next loop iteration
              line = fileIn.readLine();
           }
           // print concluding maximums and minimums
           System.out.println ("\nMaximum     \t\t" + test1max
                                  + "\t" + test2max
                                  + "\t" + test3max);
           System.out.println ("Minimum     \t\t" + test1min
                                  + "\t" + test2min
                                  + "\t" + test3min);

       //}
      // catch (IOException e)
     //     {   // identify any error that arises
      //         System.err.println (e);
        //   }
   }
}