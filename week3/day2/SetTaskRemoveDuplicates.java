package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SetTaskRemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = {2,4,6,3,5,3,2,1};
		System.out.println(nums.length);
		//output - {2,4,6,3,5,1}
		Set<Integer> uniqueSet = new HashSet<Integer>();
		
		for(int i=0; i< nums.length; i++) {
			uniqueSet.add(nums[i]);
		
		}
		System.out.println(uniqueSet);
	}

}
