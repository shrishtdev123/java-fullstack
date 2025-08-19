package com.hcl.config;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurity {

	 @Autowired
	 private PasswordEncoder  passwordEncoder;
	    @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
	    	
	    	httpSecurity
	    	.authorizeHttpRequests(auth->auth.requestMatchers("/user/**").permitAll()
	    			  .requestMatchers("/admin/**").hasRole("ADMIN")
	    			)
	    	.formLogin(Customizer.withDefaults());
	    	return httpSecurity.build();
	    }
	    
	    @Bean
	    UserDetailsService userDetailsService() {
	    	UserDetails user1=User.withUsername("admin").password( passwordEncoder.encode("pass")).roles("ADMIN").build();
	    	return new InMemoryUserDetailsManager(user1);
	    }
}
