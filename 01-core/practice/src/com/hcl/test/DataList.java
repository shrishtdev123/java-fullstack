package com.hcl.test;

import java.util.List;

public class DataList {

	
	    public List<Integer> ans;

		public DataList(List<Integer> ans) {
			super();
			this.ans = ans;
		}
	    
		
	    public void addElement(int ele) {
	    	
	    	ans.add(ele);
	    }
	    
	    public List<Integer> getList(){
	    	
	    	  return ans;
	    }
	    
	    
	    public boolean getlement(int ele) {
	    	
	    	
	    	   for(int item:ans) {
	    		   
	    		     if(item==ele) {
	    		    	 return true;
	    		     }
	    		    
	    	   }
	    	   return false;
	    }
}
