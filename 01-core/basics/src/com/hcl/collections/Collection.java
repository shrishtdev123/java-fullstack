package com.hcl.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Collection {
	
	
	
	  public static List<String> getCountryl() {
		  
		  
		     List<String> ans=new ArrayList<>();
		     
		        ans.add("india");
		        ans.add("usa");
		        ans.add("japan");
		        ans.add("china");
		        ans.add("korean");
		        
		        return ans;
		        
		  
	  }
	
	  public static void main(String[] args)
	  {
		  

        
		  Set<Student> ans=new HashSet<>();
             
		    ans.add(new Student("shrisht",21));
		    ans.add(new Student("shrisht",21));
		    ans.add(new Student("roshan",23));
		    
		    System.out.println(ans);
		    
		    
		    for(Student s:ans) {
		    	
		    	System.out.println(s.hashCode());
		    }
		   
		   
		   
		
	}

}


class Student{
	
	   String name;
	   int age;
	  
	public Student(String name,int age) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	   
}
