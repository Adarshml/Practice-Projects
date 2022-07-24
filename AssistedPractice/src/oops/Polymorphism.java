package oops;

public class Polymorphism {
	public static double area(double radius) {
		return (double) (3.14 * radius * radius);

	}

	public static int area(int a, int b) {
		return (a * b);
	}

	public static void main(String[] args) {
		double circleArea = area(5.0);
		System.out.println("Area of circle = " + circleArea);
		int rectangleArea = area(5, 4);
		System.out.println("Area of rectangle = " + rectangleArea);
	}

}
