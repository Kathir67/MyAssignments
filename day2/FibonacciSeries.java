package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int count = 10; 
		// Print first number
		System.out.println(n1);
		// Iterate from 1 to the range
		for (int i=1; i < count; i++) {
			// add first and second number assign to sum
			int sum = n1 + n2;
			// Assign second number to the first number
			n1 = n2;
			// Assign sum to the second number
			n2 = sum;
			// print sum
			System.out.println(sum);
		}
	}

}
