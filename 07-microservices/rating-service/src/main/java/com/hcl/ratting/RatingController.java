package com.hcl.ratting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {
	
	   @GetMapping("/rating")
	   public String get() {
		   return "ratng...";
	   }

}
