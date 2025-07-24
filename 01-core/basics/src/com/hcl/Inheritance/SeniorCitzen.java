package com.hcl.Inheritance;

public class SeniorCitzen extends BankAccount {

	public SeniorCitzen(double intrestRate) {
		super(intrestRate, intrestRate, intrestRate, intrestRate);

	}
	
	
	public void applyFixedDeposite() {
		
		    this.intrestRate=6.5;
	}

	
	      
}
