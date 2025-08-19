package com.hcl.entity;

public class Users {

	   private int id;
	   private String name;
	   private String mail;
	   private String password;
	public Users(int id, String name, String mail, String password) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.password = password;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", mail=" + mail + ", password=" + password + "]";
	}
	   
	   
}

