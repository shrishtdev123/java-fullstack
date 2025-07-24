
package com.july9;

public class Area {

	
	   String name;
	   int side;
	public Area(String name, int side) {
		super();
		this.name = name;
		this.side = side;
	}
	
	
	public void getArea() {
		
		
		   if(name=="circle") {
			   
			    System.out.println("the area of circle is :"+ 3.14*side*side);
		   }
		   else if(name=="triangle") {
			   
			   System.out.println("the area of triangle is :"+ 0.433*side*side);
		   }
		   else if(name=="squre") {
			   
			   System.out.println("the area of squre is :"+side*side);
		   }
	}
	   
}
