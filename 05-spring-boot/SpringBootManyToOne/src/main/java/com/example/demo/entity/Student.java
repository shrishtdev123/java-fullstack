package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="stdtab")
public class Student {

	    @Id
	  private Integer sid;
	  private String name;
	  
	  // now if we want to create relation between two table then we have to create has a 
	  // relationship okay right
	  
	  
	  // keep one things in mind is that we have to keep fk as the side of many side okay right
	  // means where there is * ,
	  @ManyToOne
	  @JoinColumn(name="bidFK")
	  private Book bob;

	public Student(Integer sid, String name, Book bob) {
		super();
		this.sid = sid;
		this.name = name;
		this.bob = bob;
	}

	public Student() {
		super();
		
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBob() {
		return bob;
	}

	public void setBob(Book bob) {
		this.bob = bob;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", bob=" + bob + "]";
	}
	
	
	
	  
	  
}
