
package com.july9;

public class Call {
	
	   private String callerid;
	   private String callNUmber;
	   private String duration;
//	public Call(int callerid, long callNUmber, float duration) {
//		super();
//		this.callerid = callerid;
//		this.callNUmber = callNUmber;
//		this.duration = duration;
//	}
	public String getCallerid() {
		return callerid;
	}
	public void setCallerid(String callerid) {
		this.callerid = callerid;
	}
	public String getCallNUmber() {
		return callNUmber;
	}
	public void setCallNUmber(String callNUmber) {
		this.callNUmber = callNUmber;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public void parseData(String s) {
		  
		 String[] data=s.split(":");
		 
		 setCallerid(data[0]);
		 setCallNUmber(data[1]);
		 setDuration(data[2]);
		 
	}
	    
	    
	    

}
