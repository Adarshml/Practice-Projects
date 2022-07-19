package module2;

public class defaultConstructor {
	void display() {
		System.out.println("Default Constructor");
	}
	public static void main(String[] args) {
		//default constructor is generated automatically when the respective object is created
		defaultConstructor obj = new defaultConstructor();
		obj.display();
	}

}
