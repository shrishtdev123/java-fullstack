package com.example.demo.IUserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.IUserService.IUserService;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRespository;

@Service
public class UserServiceImpl implements IUserService {

	  @Autowired
	  private UserRespository userRespository;
	  @Autowired
	  private BCryptPasswordEncoder pwdEncoder;
	@Override
	public User saveUser(User user) {
		
		// encode password before saving user into the database
		user.setPassword(pwdEncoder.encode(user.getPassword()));
		return userRespository.save(user);
	}

}
