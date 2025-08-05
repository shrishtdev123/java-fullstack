package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@GetMapping("/product")

	public ModelAndView getProduct(Model model) {
		Product p = new Product("Roshan", 23);
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("data", p);
	    modelAndView.setViewName("product");
	    return modelAndView;
	}

	@GetMapping("/{id}")

	public String getFactorial(@PathVariable int id, Model model) {

		int fact = 1;

		for (int i = 1; i <= id; i++) {
			fact = fact * i;
		}

		model.addAttribute("factorial", fact);

		return "factorial";

	}
	
	@GetMapping("/user/{id}")
	
	public String getUser(@PathVariable int id,Model model) {
		
		 User u=new User();
		 
		  u.setId(id);
		  u.setName("shrisht dev");
		  u.setMail("shrishtdev@gmail.com");
		  model.addAttribute("user", u);
		  
		  return "user";
	}
	
	
	@GetMapping("/form")
	public String userForm(Model model) {
		
		model.addAttribute("user", new User());
		return "userForm";
	}
	
	@PostMapping("/submit")
	public String submitForm(@ModelAttribute("user")User user ,Model model) {
		
		 model.addAttribute("message","User successfully saved");
		 return "userProfile";
	}
	
	// create  route  which find the sum for 
}
