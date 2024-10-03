package com.bptn.course._06_ObjectDemo;

public class BankSystem {

	public static void main(String[] args) {
//		BankAccount myAccount = new BankAccount("987654", 1200.00);
//		myAccount.displayAccountInfo();
//		
//		BankAccount testAccount = new BankAccount("123456", 600.00);
//		testAccount.displayAccountInfo();
		
		SavingAccount mySavingAccount = new SavingAccount("SAVINGS123", 500.00, 1.00);
		mySavingAccount.displayAccountInfo();
		mySavingAccount.applyInteresst();
		
		ChequingAccount myChequingAccount = new ChequingAccount("1234", 500.00, 100.00);
		myChequingAccount.withdraw(300);
		myChequingAccount.displayAccountInfo();
	}

}
