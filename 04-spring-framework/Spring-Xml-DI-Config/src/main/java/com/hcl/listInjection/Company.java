package com.hcl.listInjection;

import java.util.List;

public class Company {
	
	
	  private String compnayName;
	  private List<String> employees;
	public String getCompnayName() {
		return compnayName;
	}
	public void setCompnayName(String compnayName) {
		this.compnayName = compnayName;
	}
	public List<String> getEmployees() {
		return employees;
	}
	public void setEmployees(List<String> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Company [compnayName=" + compnayName + ", employees=" + employees + "]";
	}
	  
	  

}
