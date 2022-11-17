package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		// String literals
		String s1 = "madam";
		//String s2 = "";
		char[] charArray1 = s1.toCharArray();
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.println(charArray1[i]);
		}
		String s2 = String.copyValueOf(charArray1);
		System.out.println(s2);
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		if(equals) {
			System.out.println("Given word is Palindrome");
		} else {
			System.out.println("Given word is NOT Palindrome");
		}
	}

}
