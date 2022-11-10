package week1.day2;

public class ArmstrongNumber {
	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 */

	public static void main(String[] args) {
		// Declare your input
		int input = 153;
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		int calculated = 0;
		//int remainder = 0;
		//int original = 0;
		//int quotient = 0;
		// Assign input into variable original 
		int original = input;
		// Use loop to calculate: use while loop to set condition until the number greater than 0
		while (original > 0){
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			int remainder = original % 10; //3
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
			int quotient = original / 10; //15
			original = quotient; 
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
			calculated = calculated + (remainder * remainder * remainder);
		}
		// Check whether calculated and original are same
		if (calculated == input) {
			System.out.println("Given number is armstrong");
		} else {
			System.out.println("Given number is NOT armstrong");
		}
		//When it matches print it as Armstrong number
	}

}
