package com.example.demo.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Book;
import com.example.demo.entity.Student;
import com.example.demo.repo.BookRepository;
import com.example.demo.repo.StudentRepository;

@Component
public class TestRunner implements CommandLineRunner {

	  @Autowired
	 private BookRepository bookRepository;
	  
	   @Autowired
	  private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		 
		// create book object
		
		 Book bk1=new Book(50,"DS");
		 Book bk2=new Book(60,"SB");
		 
		  // save books
		 bookRepository.save(bk1);
		 bookRepository.save(bk2);
		 
		 
		 // set of book
		 
		 Set<Book> s1=Set.of(bk1,bk2);
		 
	
		// now create Student object 
		 
		 Student st1=new Student(50,"SAM",s1);
		
		 studentRepository.save(st1);
		   
		
		
	}

}
