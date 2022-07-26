package soartingandsearching;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		
		int[] arr = { 3, 6, 9, 12, 15 };//array should be in sorted order
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		int key = sc.nextInt();
		int end = arr.length;
		binarySearch(arr, 0, key, end);
		sc.close();
	}

	public static void binarySearch(int[] arr, int start, int key, int end) {
 
		while (start <= end) {
			
			int midValue = (start + end) / 2;
			if (arr[midValue] < key) {

				start = midValue + 1;
			} else if (arr[midValue] == key) {
				System.out.println("Element is found at index :" + midValue);
				break;
			} else {

				end = midValue - 1;
			}
			
		}
		if (start > end) {

			System.out.println("Element is not found");
		}

	}

}
