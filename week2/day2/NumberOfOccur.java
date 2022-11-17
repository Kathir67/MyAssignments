package week2.day2;

public class NumberOfOccur {

	public static void main(String[] args) {
		String s1 = "Welcome to Chennai";
		int count = 0;
		char[] charArray1 = s1.toCharArray();
		int length = charArray1.length;
		for(int i=0; i<length-1;i++) {
			if(charArray1[i] == 'e') {
				count = count+1;
			}
		}
		System.out.println("The letter occurrence count is " + count);
	}

}
