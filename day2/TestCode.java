package week1.day2;

import java.util.Arrays;

public class TestCode {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,7,8};
		int noOfArr = arr.length;
		Arrays.sort(arr);
	    for (int i=1; i<arr.length; i++) {
	    	if (i != arr[i-1]) {
	    		System.out.println(i);
	    	}
	    }
		
		
		/*int n1 = 0;
		int n2 = 1;
		int count = 10;
		for(int i = 1; i < count; i++) {
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			System.out.println(sum);
		}*/
				
		/*int[] arr = {60,70,10,30,20,50};
		int noOfArr = arr.length;
		Arrays.sort(arr);
		for(int i=0; i < arr.length; i++) {
			
		}
		System.out.println(arr[arr.length-2]);
		*/
				
		/*int[] arr1 = {1,2,4,6,9,3};
		int[] arr2 = {9,8,7,6,1,5,4};
		int noOfArray1 = arr1.length;
		int noOfArray2 = arr2.length;
		Arrays.sort(arr2);
		Arrays.sort(arr1);
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}*/

	}

}
