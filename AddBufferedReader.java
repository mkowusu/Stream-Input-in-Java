package streamInput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AddBufferedReader {

	public static void main(String args[]) throws Exception {

		// Initialize BufferedReader
		BufferedReader user_input = new BufferedReader(new InputStreamReader(System.in));

		// String Variable to store user input
		String R1;
		double R2 = 1;

		// Double to store sum of user inputs
		double sum;

		// Ask user for name field
		System.out.println("Enter number: ");

		// Receive user input
		R1 = user_input.readLine();

		// First input
		sum = Double.parseDouble(R1);

		// Add subsequent inputs until user inputs zero
		while(R2 != 0){

			// Set variable to users latest User input
			R2 = Double.parseDouble(user_input.readLine());

			// Update sum
			sum = sum + R2;
		}

		// Close BufferedReader
		user_input.close();

		// Print greeting to user
		System.out.println("The sum is: " + sum);

	}
}

// Citations:
// 1. http://www.java-forums.org/java-tip/5678-reading-int-values-using-bufferedreader.html
// for help reading integers using a BufferedReader

