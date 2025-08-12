package com.example.demo.userResponse;

import com.example.demo.entity.Playlist;

public class UserResponse {

	     private String message;
	     private boolean success;
	     private Playlist playlist;
		public UserResponse(String message, boolean success, Playlist playlist) {
			super();
			this.message = message;
			this.success = success;
			this.playlist = playlist;
		}
		public UserResponse() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public boolean isSuccess() {
			return success;
		}
		public void setSuccess(boolean success) {
			this.success = success;
		}
		public Playlist getPlaylist() {
			return playlist;
		}
		public void setPlaylist(Playlist playlist) {
			this.playlist = playlist;
		}
		@Override
		public String toString() {
			return "UserResponse [message=" + message + ", success=" + success + ", playlist=" + playlist + "]";
		}
	     
	     
}
