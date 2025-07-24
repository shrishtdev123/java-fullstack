package com.hcl.adversitment;

public abstract class Adversitment {
	
	    int adversitmentId;
	    String priority;
	    int noOfDays;
	    String clientName;
		public Adversitment(int adversitmentId, String priority, int noOfDays, String clientName) 
		{
			super();
			this.adversitmentId = adversitmentId;
			this.priority = priority;
			this.noOfDays = noOfDays;
			this.clientName = clientName;
		}
		public int getAdversitmentId() {
			return adversitmentId;
		}
		public void setAdversitmentId(int adversitmentId) {
			this.adversitmentId = adversitmentId;
		}
		public String getPriority() {
			return priority;
		}
		public void setPriority(String priority) {
			this.priority = priority;
		}
		public int getNoOfDays() {
			return noOfDays;
		}
		public void setNoOfDays(int noOfDays) {
			this.noOfDays = noOfDays;
		}
		public String getClientName() {
			return clientName;
		}
		public void setClientName(String clientName) {
			this.clientName = clientName;
		}
		
		
		public abstract float CalculateAdverstimentCharge(float baseCost);
			
		
		
	    

}

class videoAdverstiemnt extends Adversitment{
	
	   int duration;

	  public videoAdverstiemnt(int adversitmentId, String priority, int noOfDays, String clientName,int duration) {
		super(adversitmentId, priority, noOfDays, clientName);
		 this.duration=duration;
	}

	@Override
	public float CalculateAdverstimentCharge(float baseCost) {
		// TODO Auto-generated method stub
		
		   float baseAdverstimentCost=baseCost*getNoOfDays()*duration;
		
		   if(priority.equals("high")) {
			     
			      float BoosterCost=baseAdverstimentCost*10/100;
			      int ServiceCost=1000;
			      
			      return baseAdverstimentCost+BoosterCost+ServiceCost;
			       
			   
		   }
		return 0;
	}
	  
	  
	 
	   
	   
	
	     
}



