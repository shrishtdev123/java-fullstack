package com.hcl.tax;

public class Main {

	
	 public static void main(String[] args) {
		  
	     
		  TaxCalulator t=new TaxCalulator(2000000,true);
		      t.CalculateTax();
		      t.deduxtex();
		      t.validateSalary();
		  
	  }
		 
}
