package Module2;

import java.util.*;

public class emailValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String emailAddress;
		int flag = 0;
		ArrayList<String> email = new ArrayList<String>();
		email.add("abc@gmail.com");
		email.add("xyz@gmail.com");
		email.add("prq@gmail.com");
		System.out.print("Enter your email address : ");
		emailAddress = sc.next();
		
		for (String element : email) {
			if (element.contains(emailAddress)) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Search successful ");
		} else {
			System.out.println("Email not found ");
		}

	}

}
