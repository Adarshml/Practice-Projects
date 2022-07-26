package datastructures;
import java.util.*;

public class QueueExample {
	public static void main(String[] args) {
		// Integer queue
		Queue<Integer> EvenNumbers = new LinkedList<>(); 
		EvenNumbers.add(2);
		EvenNumbers.add(4);
		EvenNumbers.add(6);
		EvenNumbers.add(8);
		EvenNumbers.add(2);
		System.out.println("Number Queue is : " + EvenNumbers);
		System.out.println("Head = " + EvenNumbers.peek());
		EvenNumbers.remove(2);//removes first occurrence of '2'
		System.out.println("Number Queue is : " + EvenNumbers);
		// queue of strings
		Queue<String> locationsQueue = new  LinkedList<>();
		locationsQueue.add("Kolkata");
		locationsQueue.add("Patna");
		locationsQueue.add("Delhi");
		locationsQueue.add("Gurgaon");
		locationsQueue.add("Noida");
		System.out.println("Queue is : " + locationsQueue);
		System.out.println("Head of Queue : " + locationsQueue.peek());
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue);
		System.out.println("Size of Queue : " + locationsQueue.size());
	}

}
