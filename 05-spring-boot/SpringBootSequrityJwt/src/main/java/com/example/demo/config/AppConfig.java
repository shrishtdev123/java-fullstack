package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import io.jsonwebtoken.SignatureAlgorithm;
@Configuration
public class AppConfig {

	 @Bean
	 public BCryptPasswordEncoder encoder() {
		 return new BCryptPasswordEncoder();
	 }
}

// we use method of appConfig to modify the code of serviceImpl before saving the user
// encode password and then save into the database

