package week3.assignments;

import java.util.HashSet;
import java.util.Set;

public class Task5RemoveDuplicateString {
	
	public static void main(String[] args) {
		String s = "PayPal India";
		String s1 = s.toLowerCase().replace(" ", "");
		char[] charArray = s1.toCharArray();
		Set<Character> uniqueSet = new HashSet<Character>();
		Set<Character> dupSet 	 = new HashSet<Character>();
		for(int i=0;i<charArray.length;i++) {
			
			boolean add = uniqueSet.add(charArray[i]);
			if(add) {
				uniqueSet.add(charArray[i]);
			} else {
				dupSet.add(charArray[i]);
			}
			
			uniqueSet.removeAll(dupSet);
		}
		System.out.println(uniqueSet);		
	}

}
