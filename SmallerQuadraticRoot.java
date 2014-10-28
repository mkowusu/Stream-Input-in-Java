package streamInput;

import java.util.Scanner;

public class SmallerQuadraticRoot {

	public static double smallerQuadraticRoot(double a, double b, double c) throws Exception, ArithmeticException	{

		if (a == 0)
		{
			throw new ArithmeticException("Cannot compute quadratic roots of linear functions.");
		}

		double root =(-b - Math.sqrt(Math.pow(b,2)-(4*a*c)))/2;
		
		if (Math.pow(b,2)-(4*a*c) < 0)
			throw new Exception("Root is not real.");
		else
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

		try {
			root = smallerQuadraticRoot(a, b, c);
			System.out.println("The root value is: " + root);
		}
		catch (ArithmeticException arithE) 
	    {
	      System.err.println("Cannot compute a result because the coefficient of the quadratic term is 0.");
	    }    
		catch (Exception e) {
			System.err.println("Sorry, I could not compute a root.");
			e.printStackTrace();
		}
		
		
		// Close scanner
		user_input1.close();
		user_input2.close();
		user_input3.close();
	}
}

//citations:
// Mira Hall, Alex Mitchell for helping with testing if something is an imaginary number using discrimant 