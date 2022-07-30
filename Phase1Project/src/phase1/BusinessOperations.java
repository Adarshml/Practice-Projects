package phase1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BusinessOperations {
	public void businessOperations(File folder) throws IOException {
		GenericFeatures gf = new GenericFeatures();
		String[] bo = { "a. Add a file to the Application ", "b. Delete a file from the Application",
				"c. Search a file from the Appication", "d. Back to Main Menu", "e. Close Application" };
		for (int i = 0; i < bo.length; i++) {
			System.out.println(bo[i]);
		}
		System.out.print("\nEnter your choice: ");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		switch (choice) {
		case "a":
			System.out.println("\nEnter the name of file to add:");
			String name = sc.next();
			File file = new File(folder, name);
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}
			businessOperations(folder);
			break;

		case "b":
			System.out.println("\nEnter the name of file to delete:");
			String ob = sc.next();
			File file1 = new File(folder, ob);

			String ar[] = folder.list();
			boolean del = Arrays.asList(ar).contains(ob);
			if (del) {
				if (file1.delete()) {
					System.out.println("Deleted the file: " + file1.getName());
				}
			} else {
				System.out.println("Failed to delete the file.");
			}
			businessOperations(folder);
			break;

		case "c":
			System.out.println("\nEnter the name of file to search:");
			String search = sc.next();
			String arr[] = folder.list();
			boolean test = Arrays.asList(arr).contains(search);
			if (test) {
				System.out.println("File is present!");
			} else {
				System.out.println("File not found!");
			}
			businessOperations(folder);
			break;

		case "d":
			gf.optionsSelection(folder);
			break;

		case "e":
			System.out.println("\nApplication Closed! \nThankYou! \nVisit Again!");
			System.exit(0);
		default:
			System.out.println("Wrong Choice! Try Again!");
			break;
		}
		sc.close();
	}
}
