package soartingandsearching;

import java.util.Scanner;

public class LenearSearch {
	public static int l_search(int arr[],int key){
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)
			return i;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		 int[] arr = {17,2,30,47,13};

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the element to be searched");
	        int searchValue = sc.nextInt();
	            int result = (int) l_search(arr,searchValue);

	            if(result==-1){

	                System.out.println("Element not in the array");
	            } else {

	                System.out.println("Element found at "+result+" and the search key is "+arr[result]);
	            }

	            sc.close();
	        }
	}

