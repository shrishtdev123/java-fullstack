package com.hcl.listInjection;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.setter.Address;
import com.hcl.setter.Employee;

public class App {
	
	
	 public static void main(String[] args) {
		
		 
		 String beanLocation="/com/hcl/config/List.xml";
	        
	    	
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
	    	 
	    	 Company a=(Company) context.getBean("company");//new Address();
//	          a.setAddressLine1("Noida");
//	          a.setCity("greater noida");
//	          a.setCountry("india");
//	          a.setState("up");
	    	 
	          
	          System.out.println(a);
	}

}
