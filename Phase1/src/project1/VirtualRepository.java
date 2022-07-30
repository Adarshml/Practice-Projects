package project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VirtualRepository {
//	private static final String String = null;

	public static void main(String[] args) {

		ArrayList<String> filelist = new ArrayList<String>();
		filelist.add("Main.java");
		filelist.add("Home.html");
		filelist.add("writeup.txt");
		filelist.add("project.zip");
		filelist.add("window.png");
		/* System.out.println("Hello World!"); */
		System.out.println("\n***************************************************\n");
		System.out.println("\tWelcome to LockedMe.com ");
		System.out.println("\t\t-Developed by Adarsh M L \n");
		System.out.println("***************************************************");
		optionsSelection(filelist);
	}

	private static void optionsSelection(ArrayList<String> filelist) {
		String[] arr = { "1. Display all files in ascending ordedr ", "2. Business-Level operations",
				"3. Close the application" };
		int slen = arr.length;
		for (int i = 0; i < slen; i++) {
			System.out.println(arr[i]);
			// display the all the Strings mentioned in the String array
		}

		System.out.print("\nEnter your choice: ");// input mismatch exception
		Scanner sc = new Scanner(System.in);
		int options = sc.nextInt();
		switch (options) {
		case 1:
			System.out.println("All files are listed below: \n");
			display(filelist);
			optionsSelection(filelist);
			break;
		case 2:
			filelist = businessOperations(filelist);
			display(filelist);
			break;
		case 3:
			closeApp();
			break;
		default:
			System.out.println("You have made an invalid choice!");
			break;
		}

	}

	private static void closeApp() {
		System.out.println("Closing your application... \nThank you!");
	}

	private static void display(ArrayList<String> filelist) {
		Collections.sort(filelist);
		for (int i = 0; i < filelist.size(); i++) {
			System.out.println("  " + (i + 1) + "." + filelist.get(i));
		}
		System.out.println();
	}

	private static ArrayList<String> businessOperations(ArrayList<String> filelist) {
		String[] bo = { "1. Add a file to the application ", "2. Delete a file from the application",
				"3. Search a file from the appication", "4.Back to Main Menu" };
		for (int i = 0; i < bo.length; i++) {
			System.out.println(bo[i]);
		}
		System.out.print("\nEnter your choice: ");// input mismatch exception
		Scanner sc = new Scanner(System.in);
		int options = sc.nextInt();
		switch (options) {
		case 1:
			System.out.print("\nEnter the file name to add : ");// input mismatch exception
			String addFileName = sc.next();
			filelist.add(addFileName);
			businessOperations(filelist);
			break;
		case 2:
			System.out.print("\nEnter file name which is to be remove : ");// input mismatch exception
			String removeFileName = sc.next();
			filelist.remove(removeFileName);
			businessOperations(filelist);
			break;
		case 3:
			System.out.print("\nEnter file name which is to be Search : ");// input mismatch exception
			String searchFileName = sc.next();
			Collections.sort(filelist);
			int pos = Collections.binarySearch(filelist, searchFileName);
			if (pos >= 0)
				System.out.println("File found at position " + pos + 1);
			else
				System.out.println("File not found ");
			businessOperations(filelist);
			break;
		case 4:
			optionsSelection(filelist);
		default:
			System.out.println("You have made an invalid choice!");
			break;
		}
		return filelist;

	}
}
