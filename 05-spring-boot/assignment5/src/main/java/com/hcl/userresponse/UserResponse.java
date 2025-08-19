package com.hcl.userresponse;

import com.hcl.entity.Employee;

public class UserResponse {

	
	    private String message;
	    private boolean success;
	    private Employee employee;
		public UserResponse(String message, boolean success, Employee employee) {
			super();
			this.message = message;
			this.success = success;
			this.employee = employee;
		}
		public UserResponse() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public boolean isSuccess() {
			return success;
		}
		public void setSuccess(boolean success) {
			this.success = success;
		}
		public Employee getEmployee() {
			return employee;
		}
		public void setEmployee(Employee employee) {
			this.employee = employee;
		}
		@Override
		public String toString() {
			return "UserResponse [message=" + message + ", success=" + success + ", employee=" + employee + "]";
		}
	    
	    
	    
	    
	    
}
