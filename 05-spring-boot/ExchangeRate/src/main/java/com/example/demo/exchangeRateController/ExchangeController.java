package com.example.demo.exchangeRateController;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {

	
	  @GetMapping("/rate/{localCurrency}/{foreignCUrrency}")
	  public String rate(@PathVariable double localCurrency,@PathVariable double foreignCUrrency) {
		  
		  double sum=localCurrency+foreignCUrrency;
		  
		  BigDecimal bigDecimal=BigDecimal.valueOf(sum).setScale(2,RoundingMode.HALF_UP);
		  
		  String result=bigDecimal.stripTrailingZeros().toPlainString();
		  
            String s=new String("abc");
            String t="abc";
            
//            s= s.concat("xyz");
            
           
             System.out.println(s.hashCode()+"..........."+t.hashCode()+"...."+s==t);
            
		  return result;
	  }
}
