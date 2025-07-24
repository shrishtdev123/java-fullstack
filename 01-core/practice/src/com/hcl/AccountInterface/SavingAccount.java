package com.hcl.AccountInterface;

public class SavingAccount extends Account implements MaintanceCharge {

	public SavingAccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateMaintance(float noOfYears) {
		// TODO Auto-generated method stub
		return 50*noOfYears+50;
	}

}
