package week3.assignments;

import java.util.Map;
import java.util.TreeMap;

public class Task7MostDuplicate {

	public static void main(String[] args) {
		String inp = "abbaa";
		//a=1,b=1,b=2,a=2,b=3,a=3
		char[] charArray = inp.toCharArray();
		Map<Character, Integer> occ = new TreeMap<Character, Integer>();
		
		for(int i=0;i<charArray.length;i++) {
			
			if(occ.containsKey(charArray[i])) {
				int value = occ.get(charArray[i]);
				occ.put(charArray[i], value + 1);
			} else {
				occ.put(charArray[i], 1);
			}
			
		}
		System.out.println(occ);

	}

}
