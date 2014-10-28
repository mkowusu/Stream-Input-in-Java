package streamInput;

import java.util.Scanner;

public class AddScanner {

	
	public static void main (String args[])
	{       
		// use System.in to initialize scanner
		Scanner user_input = new Scanner (System.in);

		// Variable to store user input
		double R1;
		
		// Variable to store sum of user inputs
		double sum;

		// Ask user for name field
		System.out.println("Enter number: ");

		// Receive user input
		R1 = user_input.nextInt();
		
		// First input
		sum = R1;
		
		// Add subsequent inputs until user inputs zero
		while(R1 != 0){
			
			// Set variable to users latest User input
			R1 = user_input.nextInt();
			
			// Update sum
			sum = sum + R1;
		}
		
		// Close scanner
		user_input.close();

		// Print greeting to user
		System.out.println("The sum is: " + sum);

	}
}
