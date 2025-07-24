package com.july9;

public class Test {

	  public static void main(String[] args) {
		  
		    Call c=new Call();
		     c.parseData("201:6306010835:3.5");
		     
		    System.out.println("Caller id: "+c.getCallerid());
		    System.out.println("Caller Number: "+c.getCallNUmber());
		    System.out.println("Caller Duration: "+c.getDuration());
		
	}
}
