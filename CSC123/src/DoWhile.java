//Francsico Rodriguez (frodriguez127@toromail.csudh.edu)

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter a number: ");
			number = scan.nextInt();
			if (number == -1) {
				break;
			}
			System.out.println("You entered: " + number);
		} while (true);
		System.out.println("Exiting program.");
		scan.close();
	}
}
