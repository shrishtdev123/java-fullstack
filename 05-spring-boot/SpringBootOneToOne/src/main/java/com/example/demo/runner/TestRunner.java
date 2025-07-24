package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.demo.entity.Book;
import com.example.demo.entity.Student;
import com.example.demo.repo.BookRreposistory;
import com.example.demo.repo.StudentReposistory;

public class TestRunner implements CommandLineRunner{

	 
	   @Autowired
	  private BookRreposistory bookRreposistory;
	   
	    @Autowired
	   private StudentReposistory studentReposistory;
	@Override
	public void run(String... args) throws Exception {
	
		
		     // create book obj
		
		   Book bk1=new Book(101,"Dsa");
		   Book bk2=new Book(102,"tree");
		   Book bk3=new Book(103,"hb");
		   
		   // now save the book
		   bookRreposistory.save(bk1);
		   bookRreposistory.save(bk2);
		   bookRreposistory.save(bk3);
		   
		   // now create the student object
		   
		   Student st1=new Student(100,"Ram",bk1);
		   Student st2=new Student(200,"Raman",bk2);
		   Student st3=new Student(300,"dev",bk3);
		   // now save the student
		   
		   studentReposistory.save(st1);
		   studentReposistory.save(st2);
		   studentReposistory.save(st3);
		    
		   
		    
	}

}
