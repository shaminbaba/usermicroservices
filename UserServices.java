package com.user.service.services;

import java.util.List;

import com.user.service.entities.User;

public interface UserServices {
	
	
	//create
	User saveDate(User user); 
	
	//get all users
	List<User> getAllUsers();
	
	//get single user
	User getUser(String id);
		 
	

}
