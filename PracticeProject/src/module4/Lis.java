package module4;

public class Lis {
	public void count(int[] arr) {
		int count, lis = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			int max = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > max) {
					max = arr[j];
					count++;
				}
				if (count > lis)
					lis = count;
			}
		}
		System.out.println("Longest Increasing Subsequence = " + lis);
	}

	public static void main(String[] args) {
		Lis r = new Lis();
		int arr[] = { 3, 10, 2, 1, 20 };
		r.count(arr);
	}

}
