//Francisco Rodriguez (frodriguez127@toromail.csudh.edu)

import java.util.Scanner;

public class ScannerLab3 {
	public static void main(String[] args) {

		// Creating a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);

		// Reading a string from the user
		System.out.println("Enter a string: ");
		String inputString = sc.nextLine();

		// Reading an integer from the user
		System.out.println("Enter an integer: ");
		int inputInt = sc.nextInt();

		// Reading a double from the user
		System.out.println("Enter a double: ");
		double inputDouble = sc.nextDouble();

		// Closing the Scanner object
		sc.close();

		// Printing the inputs from the user
		System.out.println("Input string: " + inputString);
		System.out.println("Input integer: " + inputInt);
		System.out.println("Input double: " + inputDouble);
	}
}
