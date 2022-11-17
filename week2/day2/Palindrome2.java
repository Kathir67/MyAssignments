package week2.day2;

public class Palindrome2 {

	public static void main(String[] args) {
		String s1 = "race a car";
		String s2 = s1.replaceAll(" ","");
		System.out.println(s2);
		char[] charArray = s1.toCharArray();
		for(int i = charArray.length-1; i>=0;i--) {
			
		}
		String s3 = String.copyValueOf(charArray);
		boolean equals = s2.equals(s3);
		if(equals) {
			System.out.println("Given word is Palindrome");
		} else {
			System.out.println("Given word is not Palindrome");
		}

	}

}
