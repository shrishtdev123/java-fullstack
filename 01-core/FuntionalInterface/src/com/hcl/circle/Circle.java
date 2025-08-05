package com.hcl.circle;


interface Find{
	
	  public double getOutout(double radius);
}


public class Circle {
	
	    public double circlCalaculation(double r,Find f) {
	    	
	    	return f.getOutout(r);
	    	
	    }
	
	  public static void main(String[] args)
	  {
		  
		  Find circleArea=(r)->Math.PI*r*r;
		  Find circleCircumFerenece=(r)->2*Math.PI*r;
		  
		  
		 System.out.println("The area of circle is "+circleArea.getOutout(10));
		 System.out.println("The circumference of circle is "+circleCircumFerenece.getOutout(10));
		 
		  
		 
//		  Circle c=new Circle();  
//		  
//		  double area=c.circlCalaculation(10,circleArea);
//		  double circumfenrece=c.circlCalaculation(10, circleCircumFerenece);
//		  
//		  System.out.println("The area of Circle is "+area);
//		  System.out.println("The circurfence is "+circumfenrece);
//			    
		  
		  
		
	}

}
