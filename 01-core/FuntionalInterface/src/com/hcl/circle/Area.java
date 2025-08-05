package com.hcl.circle;


interface Find1{
	 
	  public double area();

	
}
public class Area {
	

	  public static void main(String[] args) {
		
		  // calculation of area of rectangle when two side is given
		  
		  Find1  rectangleArea=()->{
				 
				return 4*5;
			};
			
	  System.out.println("The area of Rectangle is "+rectangleArea.area());
	  
	  // calculation of area of triangle  when height and base is given 
	  
	   Find1 araofTriangle=()->{
		   
		      return 0.5*4*3;
	   };
	   
	    System.out.println("the area of triangle is "+araofTriangle.area());
	  
	    
	    // find the area of triangle when three side is given
	    
	    
	    Find1 area=()->{
	    	
	    	   int a=2;
	    	   int b=4;
	    	   int c=6;
	    	   
	    	   double semi=(a+b+c)/2;
	    	   
	    	     double t=semi*(semi-a)*(semi-b)*(semi-c);
	    	     
	    	    double ans=Math.sqrt(t);
	    	    
	    	    
	    	    return ans;
	    	  
	    };
	    
	    System.out.println("the area of triangle is :"+area.area());
	  
	   
		  
	}
   
	
	
	
	    
	
	 
}
