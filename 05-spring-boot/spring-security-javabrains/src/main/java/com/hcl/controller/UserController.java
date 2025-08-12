package com.hcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	   @GetMapping
	   public String Getmessage() {
		   return "hello spring sequrity";
	   }

}
