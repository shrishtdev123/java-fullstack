package com.example.demo.controller;

public class Calculator {
	
	
	   public static int findMax(int[] arr) {
		   
		     int max=0;
		     
		     for(int i=0;i<arr.length;i++) {
		    	 
		    	   if(arr[i]>max) {
		    		   max=arr[i];
		    	   }
		     }
		     
		     return max;
	   }
	   
	   public static int cube(int n) {
		   return n*n*n;
	   }
	   
	   
	   public static int binarySearch(int[] arr,int item) {
		   
		      int start=0;
		      int end=arr.length-1;
		      
		      while(start<=end) {
		    	  
		    	   int mid=start+(end-start)/2;
		    	   if(arr[mid]==item) {
		    		   return 1;
		    	   }
		    	   else if(item>arr[mid]) {
		    		    start=mid+1;
		    	   }
		    	   else {
		    		   end=mid-1;
		    	   }
		      }
		      
		      return -1;
	   }
	   

}
