package com.example.demo.exception;

import com.example.demo.entity.Movie;

public class MovieNotFoundException extends RuntimeException {

	public MovieNotFoundException(String message) {
		super(message);
	}

}
