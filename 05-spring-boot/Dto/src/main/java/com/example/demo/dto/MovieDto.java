package com.example.demo.dto;

public class MovieDto {
	
	 
	   private  String name;
	   private  double ratting;
	public MovieDto(String name, double ratting) {
		super();
		this.name = name;
		this.ratting = ratting;
	}
	public MovieDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRatting() {
		return ratting;
	}
	public void setRatting(double ratting) {
		this.ratting = ratting;
	}
	@Override
	public String toString() {
		return "MovieDto [name=" + name + ", ratting=" + ratting + "]";
	}
	     
	        
	     

}
