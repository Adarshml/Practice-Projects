package oops;

public class ClassAndObject {
	String name;
	int id;
	public ClassAndObject (int id,String name ) {
		this.name = name ;
		this.id = id;
		}
	public void display() {
		System.out.println("Employee id :"+ this.id);
		System.out.println("Employee name :"+ this.name);
	}
	public static void main(String[] args) {
		
		ClassAndObject obj = new ClassAndObject(101,"Smith");
		obj.display();
		
	}
}
