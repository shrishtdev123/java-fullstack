package com.hcl.abstractclass;

public class Abstract {
	
	   public static void main(String[] args) {
		
		   Product p=new Product();
		     p.show();
		     p.payment();
	}

}



 abstract class Service{
	
	  public abstract void show();
	  
	  public void payment() {
		  
		  System.out.println("payment done..");
	  }
}

class Product extends Service{
	
	 public void show() {
		 
		   System.out.println("product service is showing");
		   
	 }
}