package oops;

public class TestEncapsulation {
	public static void main(String[] args) {
		Encpsulation obj = new Encpsulation(); 
		obj.setname("Smith");
		obj.setage(22);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}

}
