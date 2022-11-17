package week2.day2;

public class StringTask {

	public static void main(String[] args) {
		// Initialise String literals
		String s1 = "Hello World";
		String s2 = "fly me  to  the moon";
		String s3 = "luffy is still joyboy";
		//task1
		String[] split1 = s1.split(" ");
		int count1 = (split1[split1.length-1].length());
		System.out.println(count1);
		//task2
		String[] split2 = s2.split(" ");
		/*for(int i=0;i<split2.length;i++) {
			System.out.println(split2[i]);
		}*/
		int count2 = split2[split2.length-1].length();
		System.out.println(count2);
		//task3
		String[] split3 = s3.split(" ");
		int count3 = split3[split3.length-1].length();
		System.out.println(count3);
	}

}
