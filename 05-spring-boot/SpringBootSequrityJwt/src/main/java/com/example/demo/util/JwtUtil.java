package com.example.demo.util;

import java.security.KeyStore.SecretKeyEntry;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.subst.Parser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {
	
//	 @Value("${app.secret}")
//	  private String secret;
//	 
//	 
	private SecretKey secret;

    // Constructor to initialize the secretKey
    public JwtUtil() {
        this.secret = Keys.secretKeyFor(SignatureAlgorithm.HS512);
    }
	 //6.validate user name in token and database,expDate
	 public boolean validateToken(String token,String username) {
		 
		       String tokenUserName=getUsername(token);
		       return (username.equals(tokenUserName) && !isTokenExp(tokenUserName));
	 }
		 
	 
	 //5.Validate Exp date
	 
	   public boolean isTokenExp(String token) {
		   
		  Date expDate=getExpDate(token);
		  
		  return expDate.before(new Date(System.currentTimeMillis()));
	   }
	 
	 
	 //4.Read the username (subject)
	 
	 public String getUsername(String token) {
		 return getClaims(token).getSubject();
	 }
	 
	 
	 //3. read exp date 
	 
	   public Date getExpDate(String token) {
		   return getClaims(token).getExpiration();
	   }
	 
	 //2. Read token data means read claims
	 
	     public Claims getClaims(String token) {
	    	 return Jwts.parser().setSigningKey(secret)
	    			 .parseClaimsJws(token)
	    			 .getBody()
	    			 ;
	     }
   //1.Generate token
	 
	 public String generatetoken(String subject) {
		 
		 
		   return Jwts.builder()
				   .setSubject(subject)
				   .setIssuer("shrisht dev")
				   .setIssuedAt(new Date(System.currentTimeMillis()))
				   .setExpiration(new Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(15)))
				   .signWith(SignatureAlgorithm.HS512,secret)
				   .compact();
	 }

}
