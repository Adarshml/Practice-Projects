package module3;

import java.util.Scanner;

public class ThrowKey {
	public static void main(String[] args) {
		int n1, n2, quotient;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		try {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			sc.close();
			if (n2 == 0) {
				// throw exception
				throw (new ArithmeticException("Can't divide by zero."));
			} else {
				quotient = n1 / n2;
				System.out.println("Quotient = " + quotient);
			}

		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}

	}

}
