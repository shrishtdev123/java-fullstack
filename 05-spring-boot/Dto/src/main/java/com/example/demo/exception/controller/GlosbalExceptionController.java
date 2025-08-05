package com.example.demo.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.MovieNotFoundException;

@RestControllerAdvice
public class GlosbalExceptionController {
	
	@ExceptionHandler(MovieNotFoundException.class)
	  public ResponseEntity<String> sentMovieNotFoundException(String message){
		  
		  return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
	  }
	
}
