package oops;

class vehicle{
	void break_ () {
		System.out.println("Apply break");
	}
}
class car extends vehicle{
	void e_car() {
		System.out.println("Electric car");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		car c = new car();
		c.e_car();
		c.break_();
	}
	
}
