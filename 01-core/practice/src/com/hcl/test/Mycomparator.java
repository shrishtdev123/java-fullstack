 package com.hcl.test;

import java.util.Comparator;

public class Mycomparator implements Comparator<Employee> {
	
	
	  public int compare(Employee e1,Employee e2) {
		  
		  
		        if(e1.getSalary()<e2.getSalary()) {
		        	return 0;
		        }
		        else {
		        	return 1;
		        }
	  }

}
