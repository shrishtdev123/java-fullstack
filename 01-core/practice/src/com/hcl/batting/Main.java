package com.hcl.batting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	  public static void main(String[] args) 
	  {
		
		    Scanner sc=new Scanner(System.in);
		    
		    List<Integer> ans=new ArrayList<>();
		     Players p=new  Players();
		        p.setScoreList(ans);
		    
		      while(true) {
		    	  
		    	   System.out.println("1. Add runs Scored ");
		    	   System.out.println("2. Calculate Avarage runs scored ");
		    	   System.out.println("3. Exite ");
		    	   
		    	   System.out.println("enter choice");
		    	   int ch=sc.nextInt();
		    	   
		    	   if(ch==1) {
		    		   
		    		     System.out.println("Ennter runs Scored");
		    		     int run=sc.nextInt();
		    		     p.addScoreDetials(run);
		    		     
		    	   }
		    	   else if(ch==2) {
		    		   
		    		   System.out.println("Average runs secured");
		    		   double result=p.getAvarageRunScored();
		    		   System.out.println(result);
		    	   }
		    	   else if(ch==3) {
		    		   
		    		     System.out.println("Thanks you for using application");
		    		     break;
		    	   }
		      }
		  
		  
	}

}
