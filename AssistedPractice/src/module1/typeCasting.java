package module1;

public class typeCasting {
	
	public static void main(String[] args) {
		char a = 'a';
		int b;
		float c;
		b = a;//implicit
		System.out.println("Implicit type casting ");
		System.out.println("character to int " + b);
		c = b;//implicit
		System.out.println("int to float " + c);
		System.out.println();

		System.out.println("Explicit type casting ");
		double x = 97.52;
		int y = (int) x;//explicit
		System.out.println("long to int " + y);
		char z = (char) y;//explicit
		System.out.println("int to char " + z);
	}

}
