package com.bptn.course._06_ObjectDemo;

class SavingAccount extends BankAccount{
	
	private double interestRate;
	
	public SavingAccount(String accountNumber, double initialBalance, double interestRate) {
		super(accountNumber, initialBalance);
		this.interestRate = interestRate;
	}
	
	public void applyInteresst() {
		double interest = getBalance() * interestRate/100;
		deposite(interest);
		
	}
	
}
