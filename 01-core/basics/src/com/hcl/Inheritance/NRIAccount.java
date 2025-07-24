package com.hcl.Inheritance;

public class NRIAccount extends BankAccount {

	public NRIAccount(double intrestRate) {
		super(intrestRate, intrestRate, intrestRate, intrestRate);
	}

	
	public void applyFixedDeposite() {
		
	    this.intrestRate=10.5;
}
}
