package com.hcl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Users;

@RestController
public class UserController {

	  @GetMapping("/login")
	  public String login() {
		  return "login successfully";
	  }
	  
	  List<Users> ans=new ArrayList<>();
	  
	  @GetMapping("/data")
	  public Users getUsers() {
		  
		   Users u=new Users();
		   
		     u.setName("Shrisht dev");
		     u.setMail("shrishtdev@gmail.com");
		     u.setPassword("1234");
		     u.setId(1);
		     
		     return u;
		   
	  }
	  
	  @PostMapping("/addUser")
	  public Users addUsers(@RequestBody Users user) {
		  
		     ans.add(user);
		   return user;
	  }
	  
	  @GetMapping("/getAlluser")
	  public List<Users> getAll(){
		  return ans;
	  }
}
