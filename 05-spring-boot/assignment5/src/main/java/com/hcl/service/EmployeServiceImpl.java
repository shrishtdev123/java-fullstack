package com.hcl.service;

import org.springframework.stereotype.Component;

import com.hcl.entity.Employee;
import com.hcl.userresponse.UserResponse;

@Component
public class EmployeServiceImpl {
	
	
	  // add Emoloyee;
	
	 public UserResponse addEmo(Employee employee) {
		 
		   if(employee.getFullname()=="") {
			   
			   UserResponse u=new UserResponse();
			    u.setMessage("name is required");
			    u.setSuccess(false);
			    u.setEmployee(null);
			    return u;
			   
		   }
		   else if(employee.getEmailId()=="") {
			   
			   UserResponse u=new UserResponse();
			    u.setMessage("Email is required");
			    u.setSuccess(false);
			    u.setEmployee(null);
			    return u;
		   }
		   else if(employee.getMobile()=="") {
			   UserResponse u=new UserResponse();
			    u.setMessage("phone is required");
			    u.setSuccess(false);
			    u.setEmployee(null);
			    return u;
		   }
		   else if(employee.getDod()=="") {
			   
			   UserResponse u=new UserResponse();
			    u.setMessage("dob is required");
			    u.setSuccess(false);
			    u.setEmployee(null);
			    return u;
		   }
		   
		   UserResponse u=new UserResponse();
		    u.setMessage("employee added successfully");
		    u.setSuccess(true);
		    u.setEmployee(employee);
		   
		 return u;
	 }
	 
	 public Employee getEmp(Employee employee) {
		 return employee;
	 }

}
