package com.shrtist;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EAddress")
public class Address {
	
	
	      @Id
	      @GeneratedValue(strategy = GenerationType.IDENTITY)
	      @Column(name="address_id")
	      private Long id;
	      private String city;
	      private String pincode;
	      private String state;
	     
	    
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		@Override
		public String toString() {
			return "Address [id=" + id + ", city=" + city + ", pincode=" + pincode + ", state=" + state + "]";
		}
		
		
	     
	     

}
