package com.hcl.mybooy.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.mybooy.entity.User;


@RestController
@RequestMapping("/v1/api")
public class LoginController {
	    
	      

	   

	@PostMapping("/register")
	  
	  public User Register(@RequestBody User user) {
		  
		     return user;
		 
	  }
	   
	  @GetMapping("/login")
	  public String Login() {
		  
		    
		  return "user login successfully";
	  }
	    

}
