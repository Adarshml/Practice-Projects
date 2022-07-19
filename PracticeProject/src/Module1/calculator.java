package Module1;
import java.util.*;
public class calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, op;
		char yn;
		System.out.println("Arithmetic Calculator\n**********************");
		while (true) {
			System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division ");
			System.out.print("Enter First Number : ");
			n1 = sc.nextInt();
			System.out.print("Enter Second Number : ");
			n2 = sc.nextInt();
			System.out.print("Select operator (1,2,3,4) : ");
			op = sc.nextInt();

			if (op == 1) {
				System.out.println("Sum = " + (n1 + n2));
			} else if (op == 2) {
				System.out.println("Differance = " + (n1 - n2));
			} else if (op == 3) {
				System.out.println("Product = " + (n1 * n2));
			} else if (op == 4) {
				System.out.println("Quotient = " + (n1 / n2));
			} else {
				System.out.println("Wrong Choice ");
			}
			
			System.out.print("Do you want to continue (Y/N) : ");
			yn = sc.next().charAt(0);
			if (yn == 'N' || yn == 'n') {
			   break;
			}

		}
	}

}
