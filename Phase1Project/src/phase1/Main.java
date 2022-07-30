package phase1;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		File folder = new File("E:\\Mphasis\\MLA\\project\\Phase1\\files");
		folder.mkdir(); // creates the folder
		System.out.println("\n***************************************************\n");
		System.out.println("\tWelcome to LockedMe.com ");
		System.out.println("\t\t-Developed by Adarsh M L \n");
		System.out.println("***************************************************");		
		GenericFeatures gf = new GenericFeatures();
		gf.optionsSelection(folder);
	}

}
