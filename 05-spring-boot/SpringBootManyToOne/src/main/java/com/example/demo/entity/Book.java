package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity

// if we want to change the table name than we have to use @Table annoation
@Table(name="bktab")
public class Book {

	 @Id
	  private int bid;
	  private String bname;
	public Book(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	public Book() {
		
		
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + "]";
	}
	 
	
	
	  
	  
}
