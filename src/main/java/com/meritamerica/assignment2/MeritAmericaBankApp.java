package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");
		
	MeritBank.getCDOfferings()[0]=new CDOffering(1, .018);
	MeritBank.getCDOfferings()[1]=new CDOffering(2, .019);
	MeritBank.getCDOfferings()[2]=new CDOffering(3, .020);
	MeritBank.getCDOfferings()[3]=new CDOffering(5, .025);
	MeritBank.getCDOfferings()[4]=new CDOffering(10, .022);
	
	AccountHolder ah1 = new AccountHolder("name","middlename","lastname","ssn");
	ah1.addCheckingAccount(1000.00);
	ah1.addSavingsAccount(10000.00);
	
	ah1.addCheckingAccount(5000.00);
	ah1.addSavingsAccount(50000.00);
	
	ah1.addCheckingAccount(50000.00);
	ah1.addSavingsAccount(500000.00);
	
	ah1.addCheckingAccount(5000.00);
	ah1.addSavingsAccount(50000.00);
	
	if (ah1.getCombinedBalance()> 250000) {
		System.out.println("Error balance over 250000");
		}
	ah1.addCDAccount(MeritBank.getBestCDOffering(0),0);
	
	MeritBank.addAccountHolder(ah1);
	
	AccountHolder ah2 = new AccountHolder("name","middlename","lastname","ssn");
	ah2.addCheckingAccount(1000.00);
	ah2.addSavingsAccount(10000.00);
	
	ah2.addCDAccount(MeritBank.getSecondBestCDOffering(0),0);
	MeritBank.addAccountHolder(ah2);
	
	MeritBank.addAccountHolder(ah2);
	
	MeritBank.clearCDOfferings();

	AccountHolder ah3 = new AccountHolder("name","middlename","lastname","ssn");
	ah3.addCDAccount(MeritBank.getSecondBestCDOffering(0),0);
	
	if (ah3.getNumberOfCDAccounts()> 0) {
		System.out.println("CD account created");
		}
	
	
	ah3.addCheckingAccount(1000.00);
	ah3.addSavingsAccount(10000.00);
	
	MeritBank.addAccountHolder(ah3);
	
	MeritBank.totalBalances();
		System.out.println(MeritBank.totalBalances());
		
}
}