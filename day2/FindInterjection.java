package week1.day2;

public class FindInterjection {

	public static void main(String[] args) {
		//Declare An array for {3,2,11,4,6,7};
		int[] arr1 = {3,2,11,4,6,7};
		int no1 = arr1.length;
		//Declare another array for {1,2,8,4,9,7};
		int[] arr2 = {1,2,8,4,9,7};
		int no2 = arr2.length;
		//Declare for loop iterator from 0 to array length
		for (int i = 0;i < no1; i++) {
			//Declare a nested for another array from 0 to array length
			for (int j = 0;j < no2; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
		//
		//Compare Both the arrays using a condition statement
		 
		//Print the first array (shoud match item in both arrays)

	}

}
