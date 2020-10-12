package com.meritamerica.assignment2;

import java.time.Instant;
import java.util.Date;

public class CDAccount {
	public CDOffering offering;
	double balance;
	java.util.Date startDate;
	long accountNumber;

	public CDAccount(CDOffering offering, double balance) {
		this.offering = offering;
		this.balance = balance;
		this.startDate = Date.from(Instant.now());
		this.accountNumber = MeritBank.getNextAccountNumber();

	}

	public double getBalance() {
		return balance;

	}

	public double getInterestRate() {
		return offering.getInterestRate();

	}

	public int getTerm() {
		return offering.term;

	}

	public Date getStartDate() {
		return startDate;

	}

	public long getAccountNumber() {
		return accountNumber;

	}

	public double futureValue() {
		double futureValue = this.getBalance() * Math.pow(1 + this.getInterestRate(), getTerm());
		return futureValue;
	}
}
