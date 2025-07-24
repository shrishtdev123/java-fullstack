package com.hcl.areacalculator;

import java.util.Scanner;

public abstract class Shape {
	
	
//	   protected String shapeName;
	   
	



	public abstract double CalculateArea();
	 
	   

}


class Rectangle extends Shape{

	
	
	   double length;
	   double breadth;
	   
	   
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}
	
	    
}


class GetInstance{
	
	
	  public static Shape getInstance(String name) {
		  
		    Scanner sc=new Scanner(System.in);
		  
		     if(name.equals("circle")) {
		    	 
		    	  System.out.println("enter the radius");
		    	  double r=sc.nextDouble();
		    	  
		    	  return new Circle(r);
		    	 
		     }
		     else if(name.equals("rectangle")) {
		    	
		    	 System.out.println("enter the length");
		    	  double l=sc.nextDouble();
		    	  System.out.println("enter the breadth");
		    	  double b=sc.nextDouble();
		    	  
		    	  return new Rectangle(l,b);
		     }
		     else {
		    	 
		    	 return null;
		     }
		  
		  
	  }
}

class Circle extends Shape{
	
	  double r;

	public Circle(double r) {
		
		this.r = r;
	}

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}
	
	
	  
}

