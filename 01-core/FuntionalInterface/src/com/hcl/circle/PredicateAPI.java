package com.hcl.circle;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//interface Predicate<T>{
//	  
//	  boolean test(T t);
//  }

public class PredicateAPI {
	
	
	  public static void main(String[] args) {
		
		   // in java Predicate is FI which represent a boolean value 
		  // it is available in java.util.Function package
		  // it is mostly used in filtering or condition
		  
		  List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
		  
		   Predicate<Integer> isEven=n->n%2==0;
		   
		   numbers.stream().filter(isEven).forEach(System.out::println);
		   
		   
		   
		  
	}

}
