
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	// constructor to create initial files.
	Main(File folder) throws IOException {
		String[] str = { "Home.html", "writeup.txt", "project.zip", "window.png" };
		for (int i = 0; i < str.length; i++) {
			File file = new File(folder, str[i]);
			file.createNewFile();

		}
	}

	public static void main(String[] args) throws IOException {

		File folder = new File("E:\\Mphasis\\MLA\\project\\Phase1\\files");
		folder.mkdir(); // creates the folder
		System.out.println("\n***************************************************\n");
		System.out.println("\tWelcome to LockedMe.com ");
		System.out.println("\t\t-Developed by Adarsh M L \n");
		System.out.println("***************************************************");
		new Main(folder);
		optionsSelection(folder);

	}

	// Generic features
	public static void optionsSelection(File folder) {
		while (true) {
			String[] arr = { "\nGeneric Features", "1. Display all files in ascending ordedr ",
					"2. Business-Level operations", "3. Close the application" };
			int slen = arr.length;
			for (int i = 0; i < slen; i++) {
				System.out.println(arr[i]);
			}
			System.out.print("\nChoose an option to continue: ");
			String opt = sc.next();

			try {
				switch (opt) {
				case "1":
					String listOfFiles[] = folder.list();
					Arrays.sort(listOfFiles);
					for (int i = 0; i < listOfFiles.length; i++) {
						System.out.println("  " + (i + 1) + ". " + listOfFiles[i]);
					}
					break;
				case "2":
					businessOperations(folder);
					break;
				case "3":
					System.out.println("\nApplication Closed! \nThankYou! \nVisit Again!");
					System.exit(0);
				default:
					System.out.println("You have made an invalid choice! Try again");
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	// Business Operations
	public static void businessOperations(File folder) throws IOException {
		while (true) {
			String[] bo = { "\na. Add a file to the Application ", "b. Delete a file from the Application",
					"c. Search a file from the Appication", "d. Back to Main Menu", "e. Close Application" };
			for (int i = 0; i < bo.length; i++) {
				System.out.println(bo[i]);
			}
			System.out.print("\nEnter your choice: ");
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
				break;

			case "d":
				optionsSelection(folder);
				break;

			case "e":
				System.out.println("\nApplication Closed! \nThankYou! \nVisit Again!");
				System.exit(0);
			default:
				System.out.println("Wrong Choice! Try Again!");
				break;
			}

		}
	}
}
