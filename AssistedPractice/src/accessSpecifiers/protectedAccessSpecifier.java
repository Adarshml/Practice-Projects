package accessSpecifiers;
import module1.refForProtected;

public class protectedAccessSpecifier extends refForProtected {
	
	public static void main(String[] args) {
		protectedAccessSpecifier obj = new protectedAccessSpecifier ();   
	    obj.display();  //inherits the methods of parent class
	    //obj.display2(); //Cannot inherits methods of private class
	    obj.display3(); //public
	}


}
