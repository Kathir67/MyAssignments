package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// Here is the input
		int[] data = {3,2,11,4,6,7};
		int noOfData = data.length;
		//1) Arrange the array in ascending order
		Arrays.sort(data);
		//2) Pick the 2nd element from the last and print it
		for(int i = 0;i < noOfData;i++);
		System.out.println(data[data.length-2]);
	}

}
