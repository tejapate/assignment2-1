package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount{
	
	public CheckingAccount(long accountNumber, double balance, double interestRate) {
		super(accountNumber, balance, interestRate);
		
	}

	public CheckingAccount(double balance, double interestRate) {
		super(balance, interestRate);
	
	}

	public CheckingAccount(int balance) {
		super (balance);
	}

}