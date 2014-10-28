package streamInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greet1 {

	public static void main(String args[]) {

		// Initialize BufferedReader
		BufferedReader user_input = new BufferedReader(new InputStreamReader(System.in));

		// Request user input
		System.out.println("What is your name?");
		
		// Initialize variable to store user input and store user input in name variable
		String name = null;
		try {
			name = user_input.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Greet User
		System.out.println("Have a nice day " + name + "!");

	}
}

// Citations:
// 1. Reading on Input Stream

// 2. http://www.java2s.com/Code/Java/File-Input-Output/ReadastringfromconsoleusingaBufferedReader.htm
// for further help understanding BufferedReaders

// 3. http://stackoverflow.com/questions/13405822/using-bufferedreader-readline-in-a-while-loop-properly
// For help understanding readline