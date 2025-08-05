package com.hcl.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stram {

	
	  public static void main(String[] args) {
		
		  
//		   List<String> listOfString=Arrays.asList("A","B","C");
//		   
//		   Stream<String> strm=listOfString.stream();
//		   
//		   strm.forEach((item)->{
//			     System.out.println(item);
//		   });
//		   
		    
//		    List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6);
//	        List<Integer> ans = data.stream().filter(item -> item % 2 == 0).map(x->x*x).collect(Collectors.toList());
//	        System.out.println(ans);
		  
		   Movie m1=new Movie("Saiyara",4.2,"movie.com","love movie");
		   Movie m2=new Movie("Dune",4.3,"movie1.com","Hollywood");
		   Movie m3=new Movie("hum tumhare hai",3.3,"xyzmovie.com","Bollywood");
		   Movie m4=new Movie("dil tumhara hai",4.3,"diltumharahai.com","Bollywood");
		   Movie m5=new Movie("squide game",5,"squidegame.com","korean series");
		   Movie m6=new Movie("payar tumse hi hai",5,"squidegame.com","love movie");
		   
		   List<Movie> data=new ArrayList<>();
		       data.add(m1);
		       data.add(m2);
		       data.add(m3);
		       data.add(m4);
		 
		       data.add(m5);
		       data.add(m6);
		       
		   
		       
		    // filter the movie whoes rating is above 3
	        System.out.println(data);
	        
	       List<Movie> movies=data.stream().filter(obj->obj.getRating()>4.5).collect(Collectors.toList());
	       
	        System.out.println(movies);
	        
	        // filter all movie whoes type is love movie
	        
	        List<Movie> loveMovie=data.
	        		stream().
	        		filter(movie->movie.getType().equalsIgnoreCase("love movie"))
	        		.collect(Collectors.toList());
	        
	        System.out.println(loveMovie);
	}
}
