package com.hcl.gap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main 
{

	public static void main(String[] args) 
	{
	
		
		GAPCalculator g=new GAPCalculator();
		
		
		 Scanner sc=new Scanner(System.in);
		    
		    List<Integer> ans=new ArrayList<>();

                   g.setGradePointList(ans);
		    
		      while(true)
		      {
		    	  
		    	   System.out.println("1. Add Grade ");
		    	   System.out.println("2. Calculate GPA ");
		    	   System.out.println("3. Exite ");
		    	   
		    	   System.out.println("enter choice");
		    	   int ch=sc.nextInt();
		    	   
		    	   if(ch==1) 
		    	   {
		    		   
		    		     System.out.println("Ennter the Obtained Grade");
		    		     char grade=Character.toUpperCase(sc.next().charAt(0));
		    		      g.addGradPoint(grade);
		    		     
		    	   }
		    	   else if(ch==2) 
		    	   {
		    		   
		    		   System.out.println("GPA scored");
		    		   double result=g.calculateGPAScore();
		    		   System.out.println(result);
		    	   }
		    	   else if(ch==3) 
		    	   {
		    		   
		    		     System.out.println("Thanks you for using application");
		    		     break;
		    	   }
		      }
		  

	}

}
