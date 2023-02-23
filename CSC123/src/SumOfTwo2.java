//Class lab 0 01-23-2023

import java.util.Scanner;

	public class SumOfTwo2 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Input the first number: ");
	        int num1 = input.nextInt();
	        System.out.print("Input the second number: ");
	        int num2 = input.nextInt();
	        int result = num1 + num2;
	        System.out.println("The result is: " + result);
	    }
	}