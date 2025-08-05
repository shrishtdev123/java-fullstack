package com.example.demo.service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Movie;
import com.example.demo.exception.MovieNotFoundException;
@Component
public interface MovieService {

	  public Movie addMovie(Movie movie);
	  public List<Movie> getAllMovie();
	  public Movie getMovie(int id);
	  public String deleteById(int id);
	  public String updateMovie(Movie movie,int id);
	  public Movie getMovieByMname(String name);
	  
}
