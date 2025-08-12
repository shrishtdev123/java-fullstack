package com.example.demo.IUserService;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface IUserService {
	
	User  saveUser(User user);

}
