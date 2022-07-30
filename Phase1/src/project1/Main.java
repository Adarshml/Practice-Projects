package project1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

 public static void main(String[] args) throws IOException {
  // TODO Auto-generated method stub
  File folder = new File("E:\\Mphasis\\MLA\\project\\Phase1\\files");
  folder.mkdir(); //creates the folder
  Scanner in = new Scanner(System.in);
  
  while(true) {
   
   System.out.println("PROTOTYPE APPLICATION OF LockedMe.com\n");
   System.out.println("Generic Features of Application are:\n");
   System.out.println("1. To retrieve files in ascending order");
   System.out.println("2. Business-Level Operations");
   System.out.println("3. Close the Application");
   System.out.println("\nChoose an option to continue:");
   int opt = in.nextInt();
   
   switch (opt) {
   case 1:
    String listOfFiles[] = folder.list();
    Arrays.sort(listOfFiles);
    for(int i=0;i<listOfFiles.length;i++) {
     System.out.println(listOfFiles[i]);
    }
    break;
   case 2:
    boolean flag = true;
     while(flag) {
     
     System.out.println("\na: To add a file to the application");
     System.out.println("b: To delete a file from the application");
     System.out.println("c: To search a file from the application");
     System.out.println("d: To close the current execution context and return to the main menu");
     System.out.println("e: Close the Application");
     System.out.println("\nChoose an option to continue:");
     
     String choice = in.next();
     
     switch (choice) {
     case "a":
      System.out.println("\nEnter the name of file to add:");
      String name = in.next();
      File file = new File(folder,name);
      if (file.createNewFile()) {  
             System.out.println("File created: " + file.getName());  
           } else {  
             System.out.println("File already exists.");  
           }       
      break;
      
     case "b":
      System.out.println("\nEnter the name of file to delete:");
      String ob = in.next();
      File file1 = new File(folder,ob);
      if (file1.delete()) { 
            System.out.println("Deleted the file: " + file1.getName());
          } else {
            System.out.println("Failed to delete the file.");
          } 
      break;

     case "c":
      System.out.println("\nEnter the name of file to search:");
      String search = in.next();
      String arr[] = folder.list();
      boolean test= Arrays.asList(arr).contains(search);
      if(test) {
       System.out.println("File is present!");
      }
      else {
       System.out.println("File not found!");
      }
      break;
      
     case "d":
      flag = false;
      break;
      
     case "e":
      System.out.println("\nApplication Closed! \nThankYou! \nVisit Again!");
      System.exit(0);
     default:
      System.out.println("Wrong Choice! Try Again!");
      break;
     }
    }
    break;
   case 3:
    System.out.println("\nApplication Closed! \nThankYou! \nVisit Again!");
    System.exit(0);

   default:
    System.out.println("Wrong Choice! Try Again!");
    break;
   }
  }

 }

}