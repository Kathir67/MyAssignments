package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		
		// String literal
		String s = "TestLeaf";
		//String object
		String s2 = new String ("TestLeaf");
		//compare value
		boolean isEqual = s.equals(s2);
		System.out.println(isEqual);
		//compare memory
		System.out.println(s == s2);
		//To ignore case
		String s3 = "testleaf";
		boolean caseEqual = s.equalsIgnoreCase(s3);
		System.out.println(caseEqual);
		//To get the number of characters
		System.out.println(s.length());
		//To convert string into char array
		char[] charArray = s.toCharArray(); 
		System.out.println(charArray[6]);
		//To get a particular position
		System.out.println(s.indexOf('L'));
		//To get a particular character
		System.out.println(s.charAt(s.length()-1));
		//To check the string contains specific text
		boolean contains = s.contains("le");
		System.out.println(contains);
		//To split the string based on space
		String s4 = "Welcome to Test Leaf";
		String[] split = s4.split(" ");
		for(int i=0; i < split.length; i++) {
			System.out.println(split[i]);
		}

	}
     
}
