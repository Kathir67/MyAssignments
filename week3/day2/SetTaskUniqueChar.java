package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SetTaskUniqueChar {

	public static void main(String[] args) {
		String companyName = "google";
		//companyName.equalsIgnoreCase(companyName)
		char[] charArray = companyName.toCharArray();
		Set<Character> company = new HashSet<Character>();
		for(int i=0; i<charArray.length ;i++) {
			company.add(charArray[i]);
		}
		
		System.out.println(company);
	}

}
