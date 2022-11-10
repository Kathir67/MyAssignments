package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator res = new Calculator();
		int summ = res.add (1,2,3);
		int subb = res.sub (10,20);
		double mull = res.mul (10.5, 20.5);
		float divv = res.div (10.55f, 10.50f);
		
		System.out.println("Addition is " + summ );
		System.out.println("Substraction is " + subb);
		System.out.println("Multiplication is " + mull);
		System.out.println("Division is " + divv);
	}

}
