package streamInput;

import java.util.Scanner;

public class QuadraticRoot {
	
	public static double smallQuadraticRoot(double a, double b, double c){
		
		double root =(-b - Math.sqrt(Math.pow(b,2)-(4*a*c)))/2;
		return root;
	}
	
	public static void main (String args[]){
		
		double a,b,c;
		double root;
		
		//Ask user for a value
		System.out.println("Enter value for a:");
		// use System.in to initialize scanner
		Scanner user_input1 = new Scanner(System.in);
		// Receive user input
		a = user_input1.nextDouble();
		
		//Ask user for b value
		System.out.println("Enter value for b:");
		// use System.in to initialize scanner
		Scanner user_input2= new Scanner(System.in);
		// Receive user input
		b = user_input2.nextDouble();
		
		//Ask user for c value
		System.out.println("Enter value for C:");
		// use System.in to initialize scanner
		Scanner user_input3= new Scanner(System.in);
		// Receive user input
		c = user_input3.nextDouble();

		root = smallQuadraticRoot(a, b, c);
		System.out.println("The root value is: " + root);
		
		// Close scanner
		user_input1.close();
		user_input2.close();
		user_input3.close();
	}
		
}

//Citations:
//	1. http://stackoverflow.com/questions/16047417/quadratic-formula-with-scanner-inputs
//        for help with translating the quadratic formula to java
	
	
