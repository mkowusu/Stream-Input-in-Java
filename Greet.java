package streamInput;

import java.util.Scanner;

public class Greet {

	public static void main (String args[])
	{       
		// use System.in to initialize scanner
		Scanner user_input = new Scanner (System.in);

		// Variable to store user input
		String name;

		// Ask user for name field
		System.out.println("What is your name?");

		// Receive user input
		name = user_input.next();

		// Close scanner
		user_input.close();

		// Print greeting to user
		System.out.println("Have a nice day " + name + "!");

	}

}

// Citation:
// 1. http://www.homeandlearn.co.uk/java/user_input.html 
// for help getting user input

// 2.http://www.tutorialspoint.com/java/util/scanner_close.htm
// For help closing scanner