package com.hcl.Inheritance;

public class BankAccount {
	
	    double withdrawAmount;
	    double depositeAmount;
	    double intrestRate=9.5;
	    double balance;


	    public BankAccount(double withdrawAmount, double depositeAmount, double intrestRate, double balance) 
	    {
			super();
			this.withdrawAmount = withdrawAmount;
			this.depositeAmount = depositeAmount;
			this.intrestRate = intrestRate;
			this.balance = balance;
		}
	   


		public void depositeMoney()
		{
		     
		       System.out.println("depositeMoney is :"+withdrawAmount);
	   }
		
		public void withdrawMoney() {
			
			 
			 balance=depositeAmount-withdrawAmount;
		}
		

}
