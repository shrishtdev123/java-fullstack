package com.example.demo.userRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.user.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	  
}
