package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

	  @RequestMapping("/home")
	  public String getMeaage(Model model) {
		  
		  model.addAttribute("message","Welcome to MVC");
		  return "home";
	  }
}
