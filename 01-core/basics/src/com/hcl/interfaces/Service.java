package com.hcl.interfaces;

public interface Service {

	     
	    public void pay();
	   
}


class paytment implements Service{

	@Override
	public void pay() {
		
		 System.out.println("payment service is excuted");
		
	}
	
	      
	       
}

class phonepay implements Service{

	@Override
	public void pay() {
		
		 System.out.println("phonepay service is excuted");
		
	}
	
	
}

class getInstace{
	
	   public static Service getInstance(String s) {
		   
		     if(s.equals("paytm")) {
		    	 
		    	 return new paytment();
		     }
		     else {
		    	 
		    	  return null;
		     }
	   }
	
}
