package com.hcl.annotions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieRunner {

	    public static void main(String[] args) {
			
	    
	  
	          ApplicationContext  m=new AnnotationConfigApplicationContext(AppConfig.class);
	          
	          Movie xt=m.getBean(Movie.class);
	          
	          System.out.println(xt.toString());
	          
	    	
		}
}
