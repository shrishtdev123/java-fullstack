package com.hcl.areacalculator;

public class Run {
	
	   public static void main(String[] args) {
		
//		   Shape s=GetInstance.getInstance("circle");
		   Shape s1=GetInstance.getInstance("rectangle");
		   
		   System.out.println(s1.CalculateArea());
		    
	}

}
