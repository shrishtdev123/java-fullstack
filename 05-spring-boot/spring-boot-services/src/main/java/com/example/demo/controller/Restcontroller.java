package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.Myservice;

@RestController
public class Restcontroller {
	
	 
//	    @Autowired
	    private Myservice myservice;
	
	    // construction di  is always prefer
	    public Restcontroller(Myservice myservice){
	    	
	    	 this.myservice=myservice;
	    	    
	    }
	     
	     @GetMapping("/getdata")
	     public String getMessage() {
	    	 
	    	 return myservice.greeting();
	     }
	     
	     @PostMapping("/getuser")
	     public User getUser(@RequestBody User user) {
	    	 
	    	  return user;
	     }
	     
	     @PostMapping("/login")
	     public LoginDetail getLogin(@RequestBody LoginDetail loginDetail ) {
	    	 
	    	 return loginDetail;
	     }

}
class LoginDetail{
	
	  public String name;
	  public String password;
	  
	  
	  
}

