package com.example.demo.service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Movie;
import com.example.demo.exception.MovieNotFoundException;
import com.example.demo.repository.MovieReposistory;
import com.example.demo.service.MovieService;

@Service
public class ServiceImpl implements MovieService {

	 @Autowired
	private MovieReposistory movieReposistory;
	@Override
	public Movie addMovie(Movie movie) {
		// TODO Auto-generated method stub
		return movieReposistory.save(movie);
	}
	@Override
	public List<Movie> getAllMovie() {
		 
		return movieReposistory.findAll();
	}
	@Override
	public Movie getMovie(int id){
		
		return movieReposistory.findById(id).get();
	}
	@Override
	public String deleteById(int id) {
		
		 movieReposistory.deleteById(id);
		return "deleted successfully";
	}
	@Override
	public String updateMovie(Movie movie, int id) {
		
		Movie DBmovie=movieReposistory.findById(id).get();
		 DBmovie.setMname(movie.getMname());
		 DBmovie.setRatting(movie.getRatting());
		 DBmovie.setImageurl(movie.getImageurl());
		 
		 movieReposistory.save(DBmovie);
		  
		return "movie updated successfully";
	}
	@Override
	public Movie getMovieByMname(String name) {
		
		
		return movieReposistory.getMovieByMname(name);
	}
	
	
	
	
	

}
