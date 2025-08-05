package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Movie;
import com.example.demo.repository.MovieReposistory;
import com.example.demo.service.MovieService;

import jakarta.annotation.Resource;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class MovieController {

	    @Autowired
	    private MovieService movieService;
	    
	    
	
	   @PostMapping("/addMovie")
	   public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
		   return new ResponseEntity<>(movieService.addMovie(movie),HttpStatus.CREATED);
	   }
	   
	   @GetMapping("/getAllmovie")
	   public ResponseEntity<List<Movie>> getAllMovie(){
		   
		    
		    return new ResponseEntity<>(movieService.getAllMovie(),HttpStatus.OK);
	   }
	   
	   // get Movie by id
	   
	   @GetMapping("/getMovieById/{id}")
	   
	   public ResponseEntity<Movie> getMovieById(@PathVariable int id) {
		   
		   return new ResponseEntity<Movie>(movieService.getMovie(id),HttpStatus.OK);
	   }
	   
	   // delete movie by id
	   
	   @GetMapping("/deleteById/{id}")
	   
	   public String deleteByID(@PathVariable int id) {
		   
		   return movieService.deleteById(id);
	   }
	   
	   // update Moive
	   
	    @PostMapping("/updateMovie/{id}")
	   public String updateMovie(@RequestBody Movie movie,@PathVariable int id) {
		   
		    
		   return movieService.updateMovie(movie, id);
	   }
	    
	    @GetMapping("/getMovieByName/{name}")
	    public ResponseEntity<Movie> getMovieByName(@PathVariable String name) {
	    	
	    	return new ResponseEntity<Movie>(movieService.getMovieByMname(name),HttpStatus.OK);
	    }
}
