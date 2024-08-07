package com.bookmyflight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyflight.entity.User;
import com.bookmyflight.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/user")
	public List<User> findAllUser(){
		return userservice.findAllUser();
	}
	
	@GetMapping("/user/{Id}")
	public User getUser(@PathVariable int Id) {
		return userservice.getUserById(Id);
	}
	
	@PostMapping("/user")
	public void createUser(@RequestBody User user) {
		userservice.saveUser(user);
	}
	
	@DeleteMapping("/user/{Id}")
	public void deleteUser(@PathVariable int Id) {
		userservice.deleteUser(Id);
	}
	
	@PutMapping("/user/{Id}")
	public User updateUser(@PathVariable int Id, @RequestBody User user) {
		return userservice.updateUser(Id, user);
	}
	
}
