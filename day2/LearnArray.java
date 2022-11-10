package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		//int[] values = new int [3];
		int[] values = {10, 50, 30, 40, 20};
		int noOfdata = values.length;
		Arrays.sort(values);
		//System.out.println(values[3]);
		//to print all data in array in asc
		
		for(int i=0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		//to print all data in array in desc
		
		for(int i= values.length-1; i >= 0; i--) {
			System.out.println(values[i]);
		}
	}

}
