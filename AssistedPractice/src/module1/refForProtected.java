package module1;

public class refForProtected {
	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
	
	private void display2() 
    { 
        System.out.println("Inside access specifier"); 
    }

	public void display3() 
    { 
        System.out.println("Inside public access specifier"); 
    }
}

