package com.user.service.controller;

import java.util.List;

import com.user.service.entities.User;
import com.user.service.services.UserServices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
 

	@Autowired
	UserServices userServices;
	
	//create
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		log.info("Create User Method is started");
		return ResponseEntity.status(HttpStatus.CREATED).body(userServices.saveDate(user));
	}
	
	//single user
	//annotation based configuration
	//@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/{userId}")
	public ResponseEntity<User> singleUser(@PathVariable String userId){
		
		log.info("singleUser Method is started");
		return ResponseEntity.ok(userServices.getUser(userId));
	}
	
	//multiple user
	@GetMapping
	public ResponseEntity<List<User>> allUser(){
		log.info("allUser Method is started");
		return ResponseEntity.ok(userServices.getAllUsers());
	}
}

