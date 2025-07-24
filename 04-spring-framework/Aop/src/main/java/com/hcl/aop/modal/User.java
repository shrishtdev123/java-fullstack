package com.hcl.aop.modal;

import java.util.Map;

import org.springframework.stereotype.Component;
@Component
public class User {
	
	    private Long id;
	    private String name;
	    private Map<String,String> address;
	    
	    
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(Long id, String name, Map<String, String> address) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Map<String, String> getAddress() {
			return address;
		}
		public void setAddress(Map<String, String> address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
		}
	    
		
	    

}
