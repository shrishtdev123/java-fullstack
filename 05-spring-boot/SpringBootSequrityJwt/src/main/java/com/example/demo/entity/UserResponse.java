package com.example.demo.entity;

public class UserResponse {
	
	   private String toekn;
	   private String message;
	public UserResponse(String toekn, String message) {
		super();
		this.toekn = toekn;
		this.message = message;
	}
	public UserResponse() {
		super();
		
	}
	public String getToekn() {
		return toekn;
	}
	public void setToekn(String toekn) {
		this.toekn = toekn;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "UserResponse [toekn=" + toekn + ", message=" + message + "]";
	}
	   

	   
}
