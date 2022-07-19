package module2;

public class innerClass {
	String s = "Good Morning ";

	class inner {
		void hello(String name) {
			System.out.println(s + name);
		}
	}

	public static void main(String[] args) {
		innerClass obj = new innerClass();
		innerClass.inner in = obj.new inner();
		in.hello("Stephen");
	}

}
