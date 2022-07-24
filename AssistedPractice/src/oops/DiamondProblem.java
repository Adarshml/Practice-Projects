package oops;

public class DiamondProblem implements Interface1, Interface2 {
	 public void show() 
	    {  
	        Interface1.super.show(); 
	        Interface2.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	DiamondProblem ob = new DiamondProblem(); 
	        ob.show(); 
	    } 

}
