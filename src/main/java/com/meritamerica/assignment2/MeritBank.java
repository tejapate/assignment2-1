package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {

	static AccountHolder[] accountHolders = new AccountHolder[5];
	static CDOffering[] cdOfferings = new CDOffering[5];
	public static long nextAccountNumber = 1;

	public static void addAccountHolder(AccountHolder accountHolder) {
		for (int i = 0; i < accountHolders.length; i++) {
			if (accountHolders[i] == null) {
				accountHolders[i] = accountHolder;
			}
		}
	}

	public static AccountHolder[] getAccountHolders() {
		return accountHolders;
	}

	public static CDOffering[] getCDOfferings() {
		return cdOfferings;
	}

	public static CDOffering getBestCDOffering(double depositAmount) {
		double highestRate = 0;
		int index = 0;
		for (int i = 0; i < cdOfferings.length; i++) {
			if (cdOfferings[i] != null && cdOfferings[i].interestRate >= highestRate) {
				highestRate = cdOfferings[i].interestRate;
				index = i;

			}

		}
		return cdOfferings[index];

	}

	public static CDOffering getSecondBestCDOffering(double depositAmount) {
		CDOffering bestCDOffering = getBestCDOffering(depositAmount);
		if (bestCDOffering != null) {
			double highestRate = getBestCDOffering(depositAmount).getInterestRate();
			double secondHighestRate = 0;
			int index = 0;
			for (int i = 0; i < cdOfferings.length; i++) {
				if (cdOfferings[i] != null && cdOfferings[i].interestRate!= highestRate && cdOfferings[i].interestRate >= secondHighestRate) {
					secondHighestRate = cdOfferings[i].interestRate;
					index = i;
					
					
				}
			}
			return cdOfferings[index];	
		}
		return null;
		
		
	
}
	public static void clearCDOfferings() {
		cdOfferings= null;
		
	}
	public static void setCDOfferings(CDOffering[] offerings) {
		cdOfferings = offerings;
		
	}
	public static long getNextAccountNumber() {
		return nextAccountNumber++;
	}
	public static double totalBalances() {
		double totalBalances = 0;
		for (int i = 0; i < accountHolders.length; i++) { 
			totalBalances+= accountHolders[i].getCombinedBalance();
		}
		return totalBalances;
	}
	public static double futureValue(double presentValue, double interestRate, int term) {
		return presentValue*Math.pow(1+interestRate,term);
		
	}

}
