package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapTaskNumberOccurance {

	public static void main(String[] args) {
		int[] nums = {1,2,1,3,2,5};
		Map<Integer, Integer> num = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length; i++) {
			
			/*if(num.containsKey(nums[i])) {
				int value = num.get(nums[i]);
				num.put(nums[i], value+1);
			} else {
				num.put(nums[i], 1);
			}*/
			//the above can be done with Java1.8 as below
			num.put(nums[i], num.getOrDefault(nums[i], 0)+1);
		}
		System.out.println(num);
	}

}
