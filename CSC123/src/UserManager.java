//Francisco Rodriguez (frodriguez127@toromail.csudh.edu)

import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {

	private ArrayList<String> users = new ArrayList<String>();
	private Scanner scanner = new Scanner(System.in);

	public void run() {
		int choice = 0;
		while (choice != 3) {
			printMenu();
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.print("Enter the first name: ");
				String firstName = scanner.nextLine();
				System.out.print("Enter the last name: ");
				String lastName = scanner.nextLine();
				System.out.print("Enter email address: ");
				String email = scanner.nextLine();
				String fullName = lastName + ", " + firstName + " (" + email + ")";
				users.add(fullName);
				System.out.println("\nThank you, user " + fullName + " has been registered.\n");
				break;
			case 2:
				listUsers();
				break;
			case 3:
				System.out.println("\nThank you for using User Manager, goodbye.\n");
				break;
			default:
				System.out.println("\nInvalid choice, please enter a number between 1 and 3.\n");
				break;
			}
		}
	}

	private void printMenu() {
		System.out.println("1 - Register User");
		System.out.println("2 - List Users");
		System.out.println("3 - Exit");
		System.out.print("Please enter your choice: ");
	}

	private void listUsers() {
		System.out.println();
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i));
		}
		System.out.println("Total users: " + users.size() + "\n");
	}

	public static void main(String[] args) {
		UserManager manager = new UserManager();
		manager.run();
	}
}
