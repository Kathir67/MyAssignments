package week1.day2;

public class PrimeNumber {
	
	int input = 7;
	int count = 0;

	public static void main(String[] args) {
		
		int input = 3;
		int count = 0;
		
		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				count++;
			}		
		}
		
		if (count == 2) {
			System.out.println("The given number is prime");
		} else {
			System.out.println("The given number is not prime");
		}
			

	}

}
