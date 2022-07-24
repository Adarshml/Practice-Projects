package module3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileaHandling {
	public static void main(String[] args) throws IOException {
		File file = new File("file2.txt");

		// Create the file
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}

		// Write Content
		FileWriter writer = new FileWriter(file);
		writer.write("Hai");
		writer.close();

		// Read Content
		try {
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured ");
			e.printStackTrace();
		}
		// Append data
		String s1 = " Good morning everyone ";
		try {
			FileWriter output = new FileWriter("file2.txt", true);
			output.write(s1);
			output.close();
			System.out.println(s1);
		} catch (IOException ex) {
			System.out.println("File append error...");
		}

	}

}
