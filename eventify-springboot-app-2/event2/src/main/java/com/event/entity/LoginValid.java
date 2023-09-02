package com.event.entity;

public class LoginValid {
	
	
	private String username;
	private String password;
	
	public LoginValid() {
		super();
	}

	public LoginValid(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginValid [username=" + username + ", password=" + password + "]";
	}
	
}
	