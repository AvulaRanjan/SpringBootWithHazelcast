package com.example.demo;

import org.springframework.cache.annotation.Cacheable;

@Cacheable
public class UserBean {

	private String userName;
	private String userId;
	public UserBean(String id, String name) {
		this.userId =id;
		this.userName =name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "userBean {userName=" + userName + ", userId=" + userId + "}";
	}

	
}
