package com.hcl.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.setter.Address;

public class Ecom {
	
	  public static void main(String[] args) 
	 {
		  
		  
//		   Product p=new Product(101,"hp","450");
//		   
//		   User u=new User(1,"dev",p);
//		   
//		   System.out.println(u);
		  

	    	String beanLocation="/com/hcl/config/constructor.xml";
	        
	    	
	    	/*
	    	 *  we have two type of spring container
	    	 *  1.BeanFactory(Parent interface)
	    	 *  2.ApplicationContext(Child interface)*
	    	 *  
	    	 * _context_________________
	    	 *   dev
	    	 *  
	    	 * __________________
	    	 */
	    	
	    	ApplicationContext context=new ClassPathXmlApplicationContext(beanLocation);
	    	 
	    	 User user=(User) context.getBean("user");//new Address();
		  
	    	  System.out.println(user);
	}

}
