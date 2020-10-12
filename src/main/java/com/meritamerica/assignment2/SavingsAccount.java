package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount (long accountNumber, double balance, double interestRate) {
		super(accountNumber, balance, interestRate);

	}

	public SavingsAccount(double balance, double interestRate) {
		super(balance, interestRate);
	
	}
	public SavingsAccount(int balance) {
		super (balance);
	}
}