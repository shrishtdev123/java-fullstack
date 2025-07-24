package com.hcl.cal;

import java.util.Scanner;

public class ScannerLaptopDemo {
	
	
	
	   public static void main(String[] args) {
		   
		   
		   
		      Scanner sc=new Scanner(System.in);
		      Caluculator c=new Caluculator();
		      
		      while(true) {
		    	  
		    	    System.out.println("1.Add");
		    	    System.out.println("2.substaraction");
		    	    System.out.println("3.multiplication");
		    	    System.out.println("4.division");
		    	    System.out.println("5.quite");
		    	    
		    	    System.out.println("Enter your choice");
		    	    
		    	    int ch=sc.nextInt();
		    	    
		    	    
		    	     if(ch==1) {
		    	    	 System.out.println("Enter first number");
		    	    	 double a=sc.nextInt();
		    	    	 System.out.println("Enter second number");
		    	    	 double b=sc.nextInt();
		    	    	 
		    	    	 double result=c.sum(a, b);
		    	    	 System.out.println("The sum is :"+result);
		    	     }
		    	     else if(ch==2) {
		    	    	 
		    	    	 System.out.println("Enter first number");
		    	    	 double a=sc.nextInt();
		    	    	 System.out.println("Enter second number");
		    	    	 double b=sc.nextInt();
		    	    	 
		    	    	 double result=c.sub(a, b);
		    	    	 System.out.println("The substraction is :"+result);
		    	     }
		    	     else if(ch==3) {
		    	    	 
		    	    	 System.out.println("Enter first number");
		    	    	 double a=sc.nextInt();
		    	    	 System.out.println("Enter second number");
		    	    	 double b=sc.nextInt();
		    	    	 
		    	    	 double result=c.mul(a, b);
		    	    	 System.out.println("The multiplication is :"+result);
		    	     }
		    	     else if(ch==4) {
		    	    	 System.out.println("Enter first number");
		    	    	 double a=sc.nextInt();
		    	    	 System.out.println("Enter second number");
		    	    	 double b=sc.nextInt();
		    	    	 
		    	    	 double result=c.div(a, b);
		    	    	  if(result==-1) {
		    	    		  
		    	    		  System.out.println("please enter valide number");
		    	    	  }
		    	    	  else {
		    	    		  System.out.println("The divisiob is :"+result);
		    	    	  }
		    	     }
		    	     else if(ch==5) {
		    	    	 
		    	    	   System.exit(0);
		    	     }
		    	    
		    	   
		    	  
		      }
	   }
	
	
	

}



class Caluculator{
	
	
	
	  public double sum(double a,double b) {
		  return a+b;
	  }
	  
	  public double sub(double a,double b) {
		  return a-b;
	  }
	  
	  public double mul(double a,double b) {
		  return a*b;
	  }
	  
	  public double div(double a,double b) {
		  
		   if(b==0) {
			   return -1;
		   }
		   return a/b;
	  }
}
