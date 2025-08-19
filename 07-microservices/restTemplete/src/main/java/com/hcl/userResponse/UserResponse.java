package com.hcl.userResponse;

import com.hcl.entity.Users;

public class UserResponse {
   
	       private String message;
	       private Users user;
		public UserResponse(String message, Users user) {
			super();
			this.message = message;
			this.user = user;
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
		public Users getUser() {
			return user;
		}
		public void setUser(Users user) {
			this.user = user;
		}
		@Override
		public String toString() {
			return "UserResponse [message=" + message + ", user=" + user + "]";
		}
	       
	       
	      
}
