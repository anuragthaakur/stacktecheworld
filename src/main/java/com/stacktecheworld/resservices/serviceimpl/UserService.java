package com.stacktecheworld.resservices.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacktecheworld.resservices.entities.User;

@Service
public class UserService {
	@Autowired
	private IUserService iUserService;
	
	public List<User> getAllUser(){
		return iUserService.findAll();
		
	}

	public User createUser(User user) {
		// TODO Auto-generated method stub
		return iUserService.save(user);
	}

	public Optional<User> getUserById(Long id) {
Optional<User> user=iUserService.findById(id);
		return user;
	}

	public User updateUserById(User user, Long id) {
		// TODO Auto-generated method stub
		user.setId(id);
		return iUserService.save(user);
	}

	public void deleateUserById(Long id) {
		if(iUserService.findById(id).isPresent()) {
			iUserService.deleteById(id);
		}
	}

	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return iUserService.findByUsername(username);
	}
}
