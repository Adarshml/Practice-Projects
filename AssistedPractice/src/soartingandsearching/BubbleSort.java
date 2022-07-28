package soartingandsearching;

public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = { 25, 20, 15, 5, 10 };
		bubbleSort(arr);
		System.out.print("Sorted list : ");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]+" ");
		}
	}

	public static void bubbleSort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++)
			for (int j = 0; j < len - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

	}

}
