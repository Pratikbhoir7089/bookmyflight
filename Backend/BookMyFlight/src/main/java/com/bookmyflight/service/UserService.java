package com.bookmyflight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyflight.entity.User;
import com.bookmyflight.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public List<User> findAllUser(){
		return userRepo.findAll();
	}
	
	public User getUserById(int Id) {
		if(!userRepo.existsById(Id)) {
			throw new RuntimeException("User with this Id not found"+Id);
		}
		return userRepo.findById(Id).get();
	}
	
	public void saveUser(User user) {
		userRepo.save(user);
	}
	
	public void deleteUser(int Id) {
		if(!userRepo.existsById(Id)) {
			throw new RuntimeException("User with this Id not found"+Id);
		}
		userRepo.deleteById(Id);
	}
	
	public User updateUser(int Id, User user) {
		if(!userRepo.existsById(Id)) {
			throw new RuntimeException("User with this Id not found"+Id);
		}
		user.setUserId(Id);
		return userRepo.save(user);
	}
	
	
}
