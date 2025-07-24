package com.hcl.account;

import java.util.Scanner;

public class Main {
	
	  public static void main(String[] args) {
		
		   Account a=new Account(12345,500);
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Available Balance is :"+a.getAccountBalnace());
		   
		   
		   while(true) {
			   
			   
			   System.out.println("1.see balance");
			   System.out.println("2.deposite balance");
			   System.out.println("3.withdrwa balance");
			   System.out.println("4.quit");
			   
			   System.out.println("Enter your choice");
			   int ch=sc.nextInt();
			   
			    if(ch==1) {
			    	
			    	 System.out.println("Available Balance is :"+a.getAccountBalnace());
			    	 
			    }
			    else if(ch==2) {
			    	 System.out.println("Enter balance ammount");
					   double amount=sc.nextDouble();
					   a.deposite(amount);
			    }
			    else if(ch==3) {
			    	
			    	  System.out.println("Enter balance ammount");
					   double amount=sc.nextDouble();
					   a.withdraw(amount);
			    }
			    else if(ch==4) {
			    	  
			    	 System.out.println("Program has been completed");
			    	 System.exit(0);
			    }
			   
			   
			   
			   
			    
		   }
		   
		  
		 
		   
	}

}
