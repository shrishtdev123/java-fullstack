package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hcl.entity.Test;
import com.hcl.entity.Users;
import com.hcl.userResponse.UserResponse;

@RestController
public class TestController {
	
	    @Autowired
	    private RestTemplate restTemplate;
	  @GetMapping("/all")
	  public String getAllServices() {
		  
		  
		   // first we create the object of RestTemplate
		  
		  
		   
		    String user=restTemplate.getForObject("http://localhost:8001/user/login", String.class);
		    String order=restTemplate.getForObject("http://localhost:8002/order/order", String.class);
		    
		    return user+order;
		   
		   
	  }
	  
	  @GetMapping("/getData")
	  public Test getallData() {
		  
		 
		  Test user=restTemplate.getForObject("http://localhost:8001/user/data", Test.class);
		  
//		   UserResponse u=new UserResponse();
//		       u.setMessage("data fetch successfully from userservice");
//		       u.setUser(user);
		  return user;
		   
	  }
	  
	  @PostMapping("/sendData")
	  public String sendData() {
		  
		  
		   Test u=new Test();
		    u.setName("Sanvee");
		     u.setMail("Sanvee@gmail.com");
		     u.setPassword("12345646");
		     u.setId(3);
		     
		  restTemplate.postForEntity("http://localhost:8001/user/addUser", u, Test.class);
		  
		  return "data send successfully";
		  
	  }
	  
	  
	  
	  

}
