package com.meritamerica.assignment2;

public class CDOffering {
	public double interestRate;
	public int term;

	public CDOffering(int term, double interestRate) {
		this.interestRate = interestRate;
		this.term = term;
	}

	public int getTerm() {
		return this.term;
	}

	public double getInterestRate() {
		return this.interestRate;
	}
}
