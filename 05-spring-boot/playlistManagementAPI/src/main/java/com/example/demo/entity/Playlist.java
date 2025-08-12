package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Playlist {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  private String name;
	  private Integer trackcount;
	public Playlist(Long id, String name, Integer trackcount) {
		super();
		this.id = id;
		this.name = name;
		this.trackcount = trackcount;
	}
	public Playlist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTrackcount() {
		return trackcount;
	}
	public void setTrackcount(Integer trackcount) {
		this.trackcount = trackcount;
	}
	@Override
	public String toString() {
		return "Playlist [id=" + id + ", name=" + name + ", trackcount=" + trackcount + "]";
	}
	  
	
	  
	  

}
