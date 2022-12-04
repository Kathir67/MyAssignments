package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task2MissingNumber {

	public static void main(String[] args) {
		int[] num = {1,3,6,5,3,2,1,9,2,7,4,4,3};
		Set<Integer> nums = new TreeSet<Integer>();
		
		for(int i=0; i<num.length; i++) {
			nums.add(num[i]);
		}
		//System.out.println(nums.size());
		System.out.println(nums);

		for (int j = 1; j <= nums.size()+1; j++ ) {
			//check if the iterator variable is not equal to the array values respectively
			if (!nums.contains(j)) {
				// print the number
				System.out.println(j);
				// once printed break the iteration
				break;
			}
		}
	}
}
