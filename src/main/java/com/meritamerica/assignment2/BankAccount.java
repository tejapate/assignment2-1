package com.meritamerica.assignment2;

public class BankAccount {
	public double balance;
	public double interestRate;
	long accountNumber;
	
	public BankAccount (double balance) {
		this.balance=balance;
		this.interestRate=0;
		this.accountNumber=MeritBank.getNextAccountNumber();
		
	}
	

	
	public BankAccount (double balance, double interestRate) {
		this.balance=balance;
		this.interestRate=interestRate;
		this.accountNumber=MeritBank.getNextAccountNumber();
		
		
	}

	public BankAccount (long accountNumber,double balance, double interestRate) {
		this.balance=balance;
		this.interestRate=interestRate;
		this.accountNumber=accountNumber;
		
	}
	public long getAccountNumber() {
		return accountNumber;
		
	}
	public double getBalance() {
		return balance;
		
	}
	public double getInterestRate() {
		return interestRate;
		
	}
	public boolean withdraw (double amount) {
		if (this.getBalance()>= amount) {
			balance = balance - amount;
			return true;
		}
		return false;
	}
	public boolean deposit (double amount) {
		if (amount < 0) {
			return false;
		}
		double newBalance = this.getBalance()+ amount;
		balance = newBalance;
		return true;
	}
	public double futureValue(int years) {
		double futureValue = this.getBalance()*Math.pow(1+this.getInterestRate(),years);
		return futureValue;
	}	

}
