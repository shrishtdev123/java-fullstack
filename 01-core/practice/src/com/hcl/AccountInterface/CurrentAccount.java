package com.hcl.AccountInterface;

public class CurrentAccount extends Account implements MaintanceCharge  {

	public CurrentAccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		
	}

	@Override
	public float calculateMaintance(float noOfYears) {
		// TODO Auto-generated method stub
		return 100*noOfYears+200;
	}

	  

}
