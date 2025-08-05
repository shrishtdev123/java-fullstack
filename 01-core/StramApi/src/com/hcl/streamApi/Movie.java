package com.hcl.streamApi;

public class Movie {
	
	  private String name;
	  private double rating;
	  private String imageurl;
	  private String type;
	public Movie(String name, double rating, String imageurl, String type) {
		super();
		this.name = name;
		this.rating = rating;
		this.imageurl = imageurl;
		this.type = type;
	}
	public Movie() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", imageurl=" + imageurl + ", type=" + type + "]";
	} 
	
	
	
	
	
	  
	  

}
