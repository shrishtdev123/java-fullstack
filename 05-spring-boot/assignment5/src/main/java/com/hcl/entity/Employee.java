package com.hcl.entity;


//@Entity
public class Employee {

//	   @Id
//	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int id;
	   private String fullname;
	   private String mobile;
	   private String emailId;
	   private String dod;
	public Employee(int id, String fullname, String mobile, String emailId, String dod) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.mobile = mobile;
		this.emailId = emailId;
		this.dod = dod;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDod() {
		return dod;
	}
	public void setDod(String dod) {
		this.dod = dod;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullname=" + fullname + ", mobile=" + mobile + ", emailId=" + emailId
				+ ", dod=" + dod + "]";
	}
	   
	   
	   
	   
	
}
