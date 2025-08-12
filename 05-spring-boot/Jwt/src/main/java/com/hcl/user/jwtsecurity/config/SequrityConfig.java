package com.hcl.user.jwtsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.hcl.user.jwtsecurity.jwtauthfilter.JwtAuthenticationFilter;
// which endpoint are secured /how password are encrypted
// how authentication is managed
@Configuration
public class SequrityConfig {

	    @Autowired
	    private JwtAuthenticationFilter jwtFilter;
	    
	    
	    @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    	
	    	http.csrf(csrf->csrf.disable())// because we are using 	jwt	(stateless)
	    	.authorizeHttpRequests(auth->auth.requestMatchers("/auth/**").permitAll()
	    	.anyRequest().authenticated())
	    	.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
	    	.headers(headers->headers.frameOptions(frame->frame.disable()))
	    	.addFilterAfter(jwtFilter, UsernamePasswordAuthenticationFilter.class);
	    	
	    	 return http.build();
	    			
	    }
	    
	    @Bean
	    public PasswordEncoder passwordEncoder() {
	    	return new BCryptPasswordEncoder();
	    }
	    
	    @Bean
	    public AuthenticationManager authenticationManager(AuthenticationConfiguration config)throws Exception{
	    	
	    	return config.getAuthenticationManager();
	    }
}

