package week2.day2;

public class HappyNumber {

	public static void main(String[] args) {
		int inp = 23;
		int rem;
		int mod;
		int sum = 0;
		while (inp == 1) {
			mod = inp % 10;
			sum = sum + (mod*mod);
			inp = inp / 10;
			sum = sum + (inp * inp);
			System.out.println(sum);
					
		}
		

	}

}
