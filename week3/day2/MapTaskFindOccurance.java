package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTaskFindOccurance {

	public static void main(String[] args) {
		String cName = "amazon india";
		//output a=3,m=1,z=1,o=1,n=2,i=2,d=1
		char[] charArray = cName.toCharArray();
		Map<Character, Integer> occ = new HashMap<Character, Integer>();
		
		for(int i=0;i<charArray.length;i++) {
			
			if(occ.containsKey(charArray[i])) {
				int value = occ.get(charArray[i]);
				occ.put(charArray[i], value + 1);
			} else {
				occ.put(charArray[i], 1);
			}
			
		}
		System.out.println(occ);
		//Print the characters which has only one occurance
		Set<Entry<Character, Integer>> entrySet = occ.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			Integer value = entry.getValue();
			if(value==1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
			
		}
	}

}
