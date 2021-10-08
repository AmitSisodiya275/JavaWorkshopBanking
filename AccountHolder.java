package com.bridgelab.workshop.banking;

public class AccountHolder {

	public static void main(String[] args) {

		SavingAccount.modifyAnnualInterestRate(4);
		System.out.println("New Annual Interest Rate is : "+SavingAccount.annualInterestRate);
		System.out.println("*************************************");
		
		SavingAccount saver1 = new SavingAccount(2000);
		System.out.println("Account Balance for Saver1 is "+saver1.getSavingBalance());
		saver1.calculateMonthlyInterest();
		System.out.println("Account Balance of Saver1 after Interest : "+saver1.getSavingBalance());
		System.out.println("*************************************");
		
		SavingAccount saver2 = new SavingAccount(3000);
		System.out.println("Account Balance for Saver 2 is "+saver2.getSavingBalance());
		saver2.calculateMonthlyInterest();
		System.out.println("Account Balance of Saver2 after Interest : "+saver2.getSavingBalance());
		System.out.println("*************************************");
		
		SavingAccount.modifyAnnualInterestRate(5);
		System.out.println("New Annual Interest Rate is : "+SavingAccount.annualInterestRate);
		System.out.println("*************************************");
		
		saver1.calculateMonthlyInterest();
		System.out.println("Account Balance saver1 after Interest : "+saver1.getSavingBalance());
		System.out.println("*************************************");
		
		saver2.calculateMonthlyInterest();
		System.out.println("Account Balance saver2 after Interest : "+saver2.getSavingBalance());
		System.out.println("*************************************");
		
		
	}

}
