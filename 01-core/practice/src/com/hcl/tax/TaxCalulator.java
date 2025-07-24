package com.hcl.tax;

public class TaxCalulator {
	
	
	     float basicSalary;
	     boolean CitizenShip;
	     
	     float tax;
	     
	     TaxCalulator(float basicSalary,boolean CitizenShip){
	    	 
	    	     this.basicSalary=basicSalary;
	    	     this.CitizenShip=CitizenShip;
	     }
	     
	     public void CalculateTax() {
	    	 
	    	  tax=30*basicSalary/100;
	    	  System.out.println("TAX for the: "+tax);
	     }
	     
	     public void deduxtex() {
	    	 
	    	   float netSalary=(basicSalary-tax);
	    	   
	    	    System.out.println("the net salary is "+netSalary);
	     }
	     
	     public void validateSalary() {
	    	 
	    	   if(basicSalary>100000 && CitizenShip==true) {
	    		   System.out.println("The citizenship is: "+true);
	    	   }
	    	   else {
	    		  
	    		   System.out.println("The citizenship is: "+false);
	    	   }
	     }

}


