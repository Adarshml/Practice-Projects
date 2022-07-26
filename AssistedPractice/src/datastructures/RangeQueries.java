package datastructures;

public class RangeQueries {
	static long query(int[] arr,int l,int r) {
		long sum = 0;
		for (int i=l;i<=r;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = { 3, 7, 2, 5, 8, 9 }; 
		System.out.println("Sum ="+query(arr,0,5));
		System.out.println("Sum ="+query(arr,3,5));
		System.out.println("Sum ="+query(arr,2,4));

	}
}
