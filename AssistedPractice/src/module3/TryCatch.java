package module3;

import java.util.Scanner;

public class TryCatch {
	
	  public static void main(String args[]) 
	    {
		    // Arithmetic Exception
		    int n1,n2,quotient;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter two numbers ");
		    n1 = sc.nextInt();
		    n2 = sc.nextInt();
		    try {
		    	quotient = n1 /n2;
		    	System.out.println("Quotient = "+quotient);
		    }
		    catch(ArithmeticException ae) {
		    	System.out.println("Divisible by zero is not possible ");
		    }
		    
		    // Array index out of bound exception
	        int[] array = new int[3];
	        try 
	        {
	            array[7] = 3;
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array index is out of bounds!"); 
	        }
	        finally 
	        {
	            System.out.println("The array is of size " + array.length);
	        }
	        sc.close();
	    }

}
