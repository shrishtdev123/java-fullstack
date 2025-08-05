package com.hcl.controller;

public class User {
	
	
	   private String name;
	   private int id;
	   private String mail;
	public User(String name, int age, String mail) {
		super();
		this.name = name;
		this.id = age;
		this.mail = mail;
	}
	
	public User() {
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int age) {
		this.id = age;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", mail=" + mail + "]";
	}
	   
	   

}
