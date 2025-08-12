package com.hcl.user.jwtsecurity.service;







import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.hcl.user.entity.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;


// this class has all jwt related methods -creating a token ,extracting claim (uername)
@Service
public class JwtService {
	 
	 
	 @Value("${jwt.secret}")
	    private String secret;

	    @Value("${jwt.expiration}")
	    private long expiration;

	    private SecretKey getSignKey() 
	    {
	        return Keys.hmacShaKeyFor(secret.getBytes());
	    }

	    
	    public String generateToken(String username) 
	    {
	        Map<String, Object> claims = new HashMap<>();
	        return Jwts.builder()
	                .setClaims(claims)
	                .setSubject(username)
	                .setIssuedAt(new Date(System.currentTimeMillis()))
	                .setExpiration(new Date(System.currentTimeMillis() + expiration))
	                .signWith(getSignKey(), SignatureAlgorithm.HS256)
	                .compact();
	    }

	    public boolean validateToken(String token, String username)
	    {
	        final String extractedUsername = extractUsername(token);
	        return (extractedUsername.equals(username) && !isTokenExpired(token));
	    }

	    public String extractUsername(String token) 
	    {
	        return extractAllClaims(token).getSubject();
	    }

	    private Claims extractAllClaims(String token) 
	    {
	        return Jwts.parserBuilder()
	                .setSigningKey(getSignKey())
	                .build()
	                .parseClaimsJws(token)
	                .getBody();
	    }
            
	     
	    private boolean isTokenExpired(String token) 
	    {
	        return extractAllClaims(token).getExpiration().before(new Date());
	    }
	    
	    
	
	   
	    

}
