package com.example.demo.userservice.userServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.user.User;
import com.example.demo.userRepository.UserRepository;
import com.example.demo.userservice.Userservice;


@Component
public class UserserviceImpl implements Userservice{

	
	  private  UserRepository userRepository ;
	  
	  public UserserviceImpl(UserRepository userRepository) {
		  this.userRepository=userRepository;
	  }
	  
	@Override
	public User addUser(User user) {
		
		
		return userRepository.save(user);
		
		 
	}

	@Override
	public List<User> getAlluser() {
		
		 return userRepository.findAll();
	}

	@Override
	public User getUserById(int id) {
		
		List<User> user=userRepository.findAll().stream().filter(obj->obj.getId()==id).collect(Collectors.toList());
		
		return user.get(0);
	}

}
