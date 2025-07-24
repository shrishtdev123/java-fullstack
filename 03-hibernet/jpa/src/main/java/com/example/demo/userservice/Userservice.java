package com.example.demo.userservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.user.User;

@Service
public interface Userservice {

	 
	  User addUser(User user);
	  List<User> getAlluser();
	  User getUserById(int id);
}
