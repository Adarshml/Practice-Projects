package module2;
class printName{
	String name;
	//parameterizedConstructor
	printName(String n){
		name = "Hello "+n;
	}
	
	void display(){
		System.out.println(name);
	}
}

public class parameterizedConstructor {
	public static void main(String[] args) {
		printName obj = new printName("einstein");
		obj.display();
	}

}
