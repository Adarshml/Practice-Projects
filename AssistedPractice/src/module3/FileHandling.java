package module3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException
    {
       createFileUsingFileClass();
    }
 
    private static void createFileUsingFileClass() throws IOException
    {
          File file = new File( "file1.txt");
  
          //Create the file
          if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
           
          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("Good Morning all");
          writer.close();
             	  
    }
 
}
