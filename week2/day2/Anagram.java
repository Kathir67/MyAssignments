package week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// String literals
		String s1 = "stops";
		String s2 = "potss";
		int count1 = 0;
		int count2 = 0;
		System.out.println(s1.length());
		if(s1.length() == s2.length()) {
			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			System.out.println(charArray1);
			System.out.println(charArray2);
			for(int i=0;i<charArray1.length;i++){
				if(charArray1[i] == charArray2[i]) {
					count1 = count1 + 1;
					System.out.println(count1);
				}else {
					count2 = count2 + 1;
				}
			}
		}
		if(s1.length() == count1) {
			System.out.println("Given string is Anagram");
		}else {
			System.out.println("Given number is not Anagram");
		}
	}
	}
