package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Playlist;
import com.example.demo.userResponse.UserResponse;

@Repository
public interface PlayListService {

	UserResponse addPlaylist(Playlist playlist);
	  List<Playlist> getAllPlayList();
	  Playlist getPlayListById(Long id);
	  UserResponse deletePlayListById(Long id);
	  
}
