package datastructures;

public class KthSmallest {
	public static void main(String[] args) {
		KthSmallest r = new KthSmallest();
		int arr[] = { 10, 4, 2, 5, 45, 78, 9 };
		r.sort(arr);
		r.display(arr, 7);

	}

	void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	void display(int[] arr, int k) {
		System.out.print(k + "th element = " + arr[k - 1]);
	}
}
