package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Employee;
import com.hcl.service.EmployeServiceImpl;
import com.hcl.userresponse.UserResponse;

@RestController
public class EmployeeController {

	    @Autowired
	   private EmployeServiceImpl employeServiceImpl;
	    
	    
	    @PostMapping("/addEmp")
	    public UserResponse addEmp(Employee employee) {
	    	
	    	return employeServiceImpl.addEmo(employee);
	    }
}
