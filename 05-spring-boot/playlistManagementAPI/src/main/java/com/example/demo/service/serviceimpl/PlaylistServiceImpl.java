package com.example.demo.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Playlist;
import com.example.demo.repository.PlayListRepository;
import com.example.demo.service.PlayListService;
import com.example.demo.userResponse.UserResponse;

@Service
public class PlaylistServiceImpl implements PlayListService{

	   @Autowired
	   private PlayListRepository playListRepository;
	@Override
	public UserResponse addPlaylist(Playlist playlist) {
		
		
		     if(playlist.getName()=="") {
		    	 Playlist p=new Playlist();
		     UserResponse userResponse=new UserResponse("Name is Required",false,p);
		     return userResponse;
		     }
		     
		     if(playlist.getTrackcount()==0) {
		    	 
		    	 Playlist p=new Playlist();
			     UserResponse userResponse=new UserResponse("Trackcount is Required",false,p);
			     return userResponse;
		     }
		
		
		
	Playlist playlist2=playListRepository.save(playlist);
	UserResponse userResponse=new UserResponse("PlayList Added Successfully",true,playlist2);
		
		return userResponse;
	}
	@Override
	public List<Playlist> getAllPlayList() {

       
		return playListRepository.findAll();
	}
	@Override
	public Playlist getPlayListById(Long id) {
		
		 Playlist playlist=playListRepository.findById(id).orElseThrow();
		return playlist;
	}
	@Override
	public UserResponse deletePlayListById(Long id) {
		
		Playlist playlist=playListRepository.findById(id).orElseThrow();
		 if(playlist==null) {
			 
		     UserResponse userResponse=new UserResponse("id does not exits",false,playlist);
		     return userResponse;
			 
		 }
		playListRepository.deleteById(id);
		
		  UserResponse userResponse=new UserResponse("playlist deleted successfully",true,playlist);
		
		  return userResponse;
		
	}

}
