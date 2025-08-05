package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

	    @Id
	    
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String mname;
	    private double ratting;
	    private String imageurl;
		public Movie(int id, String mname, double ratting, String imageurl) {
			super();
			this.id = id;
			this.mname = mname;
			this.ratting = ratting;
			this.imageurl = imageurl;
		}
		public Movie() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMname() {
			return mname;
		}
		public void setMname(String mname) {
			this.mname = mname;
		}
		public double getRatting() {
			return ratting;
		}
		public void setRatting(double ratting) {
			this.ratting = ratting;
		}
		public String getImageurl() {
			return imageurl;
		}
		public void setImageurl(String imageurl) {
			this.imageurl = imageurl;
		}
		@Override
		public String toString() {
			return "Movie [id=" + id + ", mname=" + mname + ", ratting=" + ratting + ", imageurl=" + imageurl + "]";
		}
	    
	    
	    
	    
}
