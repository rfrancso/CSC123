//Francsico Rodriguez (frodriguez127@toromail.csudh.edu)

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.println(number + " is prime: " + isPrime(number));
		input.close();
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= number / 2; i++) {
			int result = number / i;
			if (result * i == number) {
				return false;
			}
		}
		return true;
	}
}
