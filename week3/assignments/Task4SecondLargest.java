package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task4SecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> uniqueSet = new HashSet<Integer>();
		List<Integer> uniqueList = new ArrayList<Integer>();
		for(int i=0;i<data.length;i++) {
			uniqueSet.add(data[i]);
		}
		for (Integer integer : uniqueSet) {
			uniqueList.add(integer);
		}
		System.out.println(uniqueSet);
		System.out.println(uniqueList);
		Collections.reverse(uniqueList);
		System.out.println("Second Largest number: " + uniqueList.get(1));
	}

}
