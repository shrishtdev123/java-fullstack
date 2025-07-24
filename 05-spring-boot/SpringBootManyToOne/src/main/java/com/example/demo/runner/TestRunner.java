package com.example.demo.runner;

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
	 private BookRepository brepo;
	 
	  @Autowired
	 private StudentRepository srepo;
	@Override
	public void run(String... args) throws Exception {


		 //create the book object
		
		 Book bk1=new Book(101,"DS");
		 Book bk2=new Book(102,"SB");
		 
		 //save this Book
		 brepo.save(bk1);
		 brepo.save(bk2);
		 
		 // create student object
		 
		 Student st1=new Student(50,"SAM",bk1);
		 Student st2=new Student(60,"john",bk1);
		 Student st3=new Student(70,"angela",bk2);
		 Student st4=new Student(80,"bob",bk2);
		 
		 
		 srepo.save(st1);
		 srepo.save(st2);
		 srepo.save(st3);
		 srepo.save(st4);
		
	}

	 
}
