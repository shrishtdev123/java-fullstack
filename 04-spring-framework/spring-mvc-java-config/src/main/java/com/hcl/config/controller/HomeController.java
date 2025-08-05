package com.hcl.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

	
	@RequestMapping("/user")
	   public String home(Model model) {
		   
		   model.addAttribute("message", "welcome to home conroller");
		   
		   return "home";
		   
	   }
}
