package com.hcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	   @GetMapping("/admin")
	   public String getMessage() {
		   return "i am admin.this route work properley";
	   }
	   
	   @GetMapping("/admin/{id}")
	   public int getId(@PathVariable int id) {
		   return id;
	   }
}
