package module3;

public class CustomException extends Exception {

	public CustomException(String s) {
		super(s);
	}

	public static void main(String args[]) {
		try {
			throw new CustomException("temp");
		} catch (CustomException ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}
	}
}
