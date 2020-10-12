package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder {
	
	String firstName; 
	String middleName; 
	String lastName;
	String ssn;
	CheckingAccount[] checkingAccounts;
	SavingsAccount[] savingsAccounts;
	CDAccount[] cdAccounts;

	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccounts = new CheckingAccount[5];
		this.savingsAccounts = new SavingsAccount[5];
		this.cdAccounts = new CDAccount[5];
		
	}
		
	public String getFirstName() {
		return this.firstName;
	}
	public void	setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public CheckingAccount[] getCheckingAccount() {
		return checkingAccounts;
	}

	public SavingsAccount[] getSavingsAccount() {
		return savingsAccounts;
	}
	
	public CheckingAccount addCheckingAccount(double openingBalance) {
		if (getCheckingBalance()+ getSavingsBalance()+ openingBalance > 250000) {
			return null;
		}
		CheckingAccount newCheckingAccount = new CheckingAccount(openingBalance, 0.0001);
		for (int i = 0; i < checkingAccounts.length; i++) {
			if (checkingAccounts[i] == null) {
				checkingAccounts[i] = newCheckingAccount;
				break;
			}
		}
		return newCheckingAccount;
		
		
	}
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		if (getCheckingBalance()+ getSavingsBalance()+ checkingAccount.balance > 250000) {
			return null;
		}
		for (int i = 0; i < checkingAccounts.length; i++) {
			if (checkingAccounts[i] == null) {
				checkingAccounts[i] = checkingAccount;
			}
		}
		return checkingAccount;
		
	}
	public int getNumberOfCheckingAccounts() {
		for (int i = 0; i < checkingAccounts.length; i++) {
		if (checkingAccounts[i] == null) {
			return i;
		}
		}
		return 0;
	}
	public double getCheckingBalance() {
		double totalBalances = 0;
		for (int i = 0; i < checkingAccounts.length; i++) { 
			if (checkingAccounts[i] != null) {
				totalBalances+= checkingAccounts[i].balance;
			}
		}
		return totalBalances;
	}
	public SavingsAccount addSavingsAccount(double openingBalance) {
	if (getCheckingBalance()+ getSavingsBalance()+ openingBalance > 250000) {
		return null;}
		SavingsAccount newSavingsAccount = new SavingsAccount(openingBalance, 0.01);
		for (int i = 0; i < savingsAccounts.length; i++) {
			if (savingsAccounts[i] == null) {
				savingsAccounts[i] = newSavingsAccount;
				break;
			}
		}
		return newSavingsAccount;
	
		
		
	}
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount)
	{
		if (getCheckingBalance()+ getSavingsBalance()+ savingsAccount.balance > 250000) {
			return null;
		}
		for (int i = 0; i < savingsAccounts.length; i++) {
			if (savingsAccounts[i] == null) {
				savingsAccounts[i] = savingsAccount;
				break;
			}
		}
		return savingsAccount;
		
		
	}
	public int getNumberOfSavingsAccounts() {
		for (int i = 0; i < savingsAccounts.length; i++) {
		if (savingsAccounts[i] == null) {
			return i;
		}
		}
		return 0;
	}
	public double getSavingsBalance() {
		double totalBalances = 0;
		for (int i = 0; i < savingsAccounts.length; i++) {
			if (savingsAccounts[i] != null) {
			totalBalances+= savingsAccounts[i].balance;
			}
		}
		return totalBalances;
	}
	
	
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		CDAccount newCDAccount = new CDAccount(offering,openingBalance);
		for (int i = 0; i < cdAccounts.length; i++) {
			if (cdAccounts[i] == null) {
				cdAccounts[i] = newCDAccount;
				break;
			}
		}
		return newCDAccount;
		
		
	}
	public CDAccount addCDAccount(CDAccount cdAccount) {
		for (int i = 0; i < savingsAccounts.length; i++) {
			if (cdAccounts[i] == null) {
				cdAccounts[i] = cdAccount;
				break;
			}
		}
		return cdAccount;
		
	}
	public int getNumberOfCDAccounts() {
		for (int i = 0; i < cdAccounts.length; i++) {
		if (cdAccounts[i] == null) {
			return i;
		}
		}
		return 0;
	}
	public double getCDBalance() {
		double totalBalances = 0;
		for (int i = 0; i < cdAccounts.length; i++) { 
			if (cdAccounts[i] != null) {
			totalBalances+= cdAccounts[i].balance;	
			}
			
		}
		return totalBalances;
	}
	
	public double getCombinedBalance() {
		return getCheckingBalance() + getSavingsBalance() + getCDBalance();
		}
	public CheckingAccount[] getCheckingAccounts() {
		return checkingAccounts;
	}
	public SavingsAccount[] getSavingsAccounts() {
		return savingsAccounts;
	}
	public CDAccount[] getCDAccounts() {
		return cdAccounts;
	}
}