package week3.day1;

public class Calculator {
	//Method 1 for addition
	public void addNumbers(int a, int b) {
		System.out.println(a + b);
	}
	//Method 2 for addition
	public void addNumbers(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	//Method 1 for substraction
	public void subNumbers(double a, double b) {
		System.out.println(a - b);
	}
	//Method 2 for substraction
	public void subNumbers(int a, int b) {
		System.out.println(a - b);
	}
	//Method 1 for multiplication
	private void mulNumbers(int a, double b) {
		System.out.println(a*b);
	}
	//Method 1 for multiplication
	private void mulNumbers(double a, double b) {
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		Calculator overload = new Calculator();
		overload.addNumbers(2, 3);
		overload.addNumbers(2, 3, 4);
		overload.subNumbers(10.5, 5.2);
		overload.subNumbers(4, 2);
		overload.mulNumbers(2, 2.5);
		overload.mulNumbers(10.2, 10.5);

	}

}
