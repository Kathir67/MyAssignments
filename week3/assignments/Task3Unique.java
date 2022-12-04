package week3.assignments;

import java.util.HashSet;
import java.util.Set;

public class Task3Unique {

	public static void main(String[] args) {
		String s1 = "babu";
		char[] charArray = s1.toCharArray();
		Set<Character> unique = new HashSet<Character>();
		for(int i=0;i<charArray.length; i++) {
			boolean add = unique.add(charArray[i]);
			//System.out.println(add);
			if(add == false) {
				if (unique.contains(charArray[i])) {
					unique.remove(charArray[i]);
				}else {
					unique.add(charArray[i]);
				}
			}
		}
		System.out.println(unique);
		
	}

}
