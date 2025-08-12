package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Playlist;
import com.example.demo.service.PlayListService;
import com.example.demo.userResponse.UserResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/playlists")
public class PlayListController {
	
	    @Autowired
	    private PlayListService playListService;
	    
	   // addplaylist to the database
	    
	    @PostMapping
	    public ResponseEntity<UserResponse> addPlaylist(@RequestBody Playlist playlist){
	    	
	    	return new ResponseEntity<>(playListService.addPlaylist(playlist),HttpStatus.CREATED);
	    }
	    
	    // getAll PlayList 
	    
	    @GetMapping
	    public ResponseEntity<List<Playlist>> getAllPlayList(){
	    	
	    	 return new ResponseEntity<List<Playlist>>(playListService.getAllPlayList(),HttpStatus.OK);
	    	
	    }
	    
	    // getPlayListByid
	    
	    @GetMapping("/{playListId}")
	    public ResponseEntity<Playlist> getPlayListByid(@PathVariable Long playListId){
	    	
	    	return new ResponseEntity<Playlist>(playListService.getPlayListById(playListId),HttpStatus.OK);
	    }
	    
	    // deletePlayList By id
	    @DeleteMapping("/{playListId}")
	    public ResponseEntity<UserResponse> deletePlayListById(@PathVariable Long playListId){
	    	
	    	  
	    	  return new ResponseEntity<>(playListService.deletePlayListById(playListId),HttpStatus.OK);
	    	
	    }
	    
	    

}
