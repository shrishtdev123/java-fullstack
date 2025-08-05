package com.example.demo.modalMapper;

import com.example.demo.dto.MovieDto;
import com.example.demo.entity.Movie;

public class Mapper {
	
	
	   // Mapper method to convert movie to MovieDto
	
	  public static MovieDto movieToMovieDto(Movie movie) {
		    
		     
		  MovieDto movieDto=new MovieDto(movie.getMname(),movie.getRatting()) ;
		  
		  return movieDto;
		    
	  }
	  
	  // method MovieDto object to Movie object 
	  
	  
	
	 

}
