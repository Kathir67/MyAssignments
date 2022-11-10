package week1.day2;

public class Factor {
	

	public static void main(String[] args) {
		int inp = 5;
		int fact = 1;
		
		for (int i = inp; i>=1; i--){
			fact = fact * i;
		}
		System.out.println(fact);

	}

}
