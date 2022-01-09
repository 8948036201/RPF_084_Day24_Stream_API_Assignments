package com.bridgelabz.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	
	static List<Contact> addressBook;

	public static void main(String[] args) {
		addressBook = new LinkedList<Contact>();

		boolean isExit = false;

		System.out.println(
				"Welcome to the Address book, Manage your contacts "
						+ "with the Address book");
		Scanner scanner = new Scanner(System.in);
		while (!isExit) {
			System.out.println("Select the option from below");
			if (addressBook.isEmpty()) {
				System.out.println("1. Add Contact" + "\n5. Exit");
			} else {
				System.out.println("1. Add Contact"
						+ "\n2. Display Contact\n3. Edit Contact"
						+ "\n4. Delete Contact\n5. Exit");
			}
			String option = scanner.nextLine();

			switch (option) {
			case "1":
				break;

			case "2":
				break;

			case "3":
				break;

			case "4":
				break;

			case "5":
				break;

			default:
				break;
			}
		}
		scanner.close();
	}
}
