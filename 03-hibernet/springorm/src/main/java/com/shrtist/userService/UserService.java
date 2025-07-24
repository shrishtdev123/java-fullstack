package com.shrtist.userService;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.shrtist.Employee;

public class UserService {
	
	     
	
	    public static Employee getuser(Session session,SessionFactory sessionFactory,int id ) {
	    	
	    	session = sessionFactory.openSession();
	    	Employee retrievedUser = session.get(Employee.class,id);
	    	
	    	return retrievedUser;
	    	
	    	
	    }

}
