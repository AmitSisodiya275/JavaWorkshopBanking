package com.bridgelab.workshop.banking;

public class SavingAccount {
	
	static float annualInterestRate;
	private float savingBalance;
	
	public SavingAccount(float savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	public float calculateMonthlyInterest() {
		float monthlyInterest = (savingBalance * annualInterestRate/100)/12;
		savingBalance += monthlyInterest;
		return savingBalance;
	}
	
	public static void modifyAnnualInterestRate(float iRate) {
		annualInterestRate = iRate;
	}
	
	public float getSavingBalance() {
		return savingBalance;
	}
}
