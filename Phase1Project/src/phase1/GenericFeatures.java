package phase1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class GenericFeatures {
	BusinessOperations obj = new BusinessOperations();
	public void optionsSelection(File folder)  {
		Scanner sc = new Scanner(System.in);
		String[] arr = { "\nGeneric Features","1. Display all files in ascending ordedr ", "2. Business-Level operations",
				"3. Close the application" };
		int slen = arr.length;
		for (int i = 0; i < slen; i++) {
			System.out.println(arr[i]);
		}
		System.out.print("\nChoose an option to continue: " );
		String opt = sc.next();

		try {
			switch (opt) {
			case "1":
				String listOfFiles[] = folder.list();
				Arrays.sort(listOfFiles);
				for (int i = 0; i < listOfFiles.length; i++) {
					System.out.println("  "+(i+1)+". "+listOfFiles[i]);
				}
				optionsSelection(folder);
				break;
			case "2":
				obj.businessOperations(folder);
				break;
			case "3":
				System.out.println("\nApplication Closed! \nThankYou! \nVisit Again!");
				System.exit(0);
			default:
				System.out.println("You have made an invalid choice! Try again");
				optionsSelection(folder);
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}
