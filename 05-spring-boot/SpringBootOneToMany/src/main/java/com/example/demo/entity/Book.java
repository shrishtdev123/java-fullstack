package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bktab")
public class Book {

	    @Id
	   private Integer bid;
	   private String bname;
	public Book(Integer bid, String bname) {
		
		this.bid = bid;
		this.bname = bname;
	}
	public Book() {
		
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
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
