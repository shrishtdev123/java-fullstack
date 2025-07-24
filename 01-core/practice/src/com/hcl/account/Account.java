package com.hcl.account;

public class Account {

	    private long accountNumber;
	    private double accountBalnace;
		public Account(long accountNumber, double accountBalnace) {
			super();
			this.accountNumber = accountNumber;
			this.accountBalnace = accountBalnace;
		}
		public long getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
		}
		public double getAccountBalnace() {
			return accountBalnace;
		}
		public void setAccountBalnace(double accountBalnace) {
			this.accountBalnace = accountBalnace;
		}
	     
		
		public void deposite(double balance) {
			
			   if(balance<0) {
				   System.out.println("please enter the valide balance");
			   }
			   accountBalnace+=balance;
			 
		}
		
		public void withdraw(double balance) {
			
			  if(balance> accountBalnace) {
				  
				  System.out.println("please enter withdrwal amount less than or equal to accountBalance");
				  
			  }
			  
			  accountBalnace-=balance;
		    
		}
		
		public double getaccountBalnace() {
			return accountBalnace;
		}
		
	     
	     
}
