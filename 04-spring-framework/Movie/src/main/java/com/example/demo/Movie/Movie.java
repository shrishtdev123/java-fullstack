package com.example.demo.Movie;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Component
public class Movie {
	    private int id;
	    private String moviName;
	    private double rating;
	    private String description;
	    private String director;
	    private String hero;
	    private String heroen;
	    private String link;
	    private String poster;
	    
	    
	    
		public Movie() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Movie(int id,String moviName, double rating, String description, String director, String hero, String heroen,
				String link, String poster) {
			super();
			this.id=id;
			this.moviName = moviName;
			this.rating = rating;
			this.description = description;
			this.director = director;
			this.hero = hero;
			this.heroen = heroen;
			this.link = link;
			this.poster = poster;
		}
		public String getMoviName() {
			return moviName;
		}
		public void setMoviName(String moviName) {
			this.moviName = moviName;
		}
		public double getRating() {
			return rating;
		}
		public void setRating(double rating) {
			this.rating = rating;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		public String getHero() {
			return hero;
		}
		public void setHero(String hero) {
			this.hero = hero;
		}
		public String getHeroen() {
			return heroen;
		}
		public void setHeroen(String heroen) {
			this.heroen = heroen;
		}
		public String getLink() {
			return link;
		}
		public void setLink(String link) {
			this.link = link;
		}
		public String getPoster() {
			return poster;
		}
		public void setPoster(String poster) {
			this.poster = poster;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		@Override
		public String toString() {
			return "Movie [id=" + id + ", moviName=" + moviName + ", rating=" + rating + ", description=" + description
					+ ", director=" + director + ", hero=" + hero + ", heroen=" + heroen + ", link=" + link
					+ ", poster=" + poster + "]";
		}
		
	   
	    
	    
	    

}
