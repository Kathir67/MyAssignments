package org.college;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Axis bank deposit rate is little higher");
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
		bank.fixed();
		bank.saving();

	}

}
