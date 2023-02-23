//Francsico Rodriguez (frodriguez127@toromail.csudh.edu)

import java.util.Scanner;

public class CoinCounter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the number of pennies: ");
		int pennies = scanner.nextInt();

		System.out.print("Please enter the number of nickels: ");
		int nickels = scanner.nextInt();

		System.out.print("Please enter the number of dimes: ");
		int dimes = scanner.nextInt();

		System.out.print("Please enter the number of quarters: ");
		int quarters = scanner.nextInt();

		int totalCents = pennies + nickels * 5 + dimes * 10 + quarters * 25;
		int dollars = totalCents / 100;
		int remainingCents = totalCents - dollars * 100;

		System.out.println("You have " + dollars + " dollar(s) and " + remainingCents + " cent(s)");
	}
}
