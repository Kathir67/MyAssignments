package week2.day2;

public class FindTypes {

	public static void main(String[] args) {
		String s1 = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] charArray1 = s1.toCharArray();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int length = charArray1.length;
		for(int i=0; i<length-1;i++) {
			if (Character.isLetter(charArray1[i])) {
				count1 = count1 + 1;
			} else if (Character.isDigit(charArray1[i])) {
				count2 = count2 + 1;
			} else if (Character.isSpaceChar(charArray1[i])) {
				count3 = count3 + 1;
			} else {
				count4 = count4 + 1;
			}
		}
		System.out.println("Letter " + count1);
		System.out.println("Number " + count2);
		System.out.println("Spaces " + count3);
		System.out.println("Special " + count4);
	}

}
