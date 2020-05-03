package com.stacktecheworld.resservices.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stacktecheworld.resservices.entities.User;
import com.stacktecheworld.resservices.serviceimpl.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUser();
	}
	
	@PostMapping("/createuser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/getuser/{id}")
	public Optional<User> getUserById(@PathVariable("id") Long id){
		return userService.getUserById(id);
	}
	
	@PutMapping("/updateUser/{id}")
	public User updateUserId(@RequestBody User user, @PathVariable("id") Long id) {
		return userService.updateUserById(user,id);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUserById(@PathVariable("id") Long id) {
		userService.deleateUserById(id);
	}
	
	@GetMapping("/user/byusername/{username}")
	public User getUserByUsername(@PathVariable("username") String username) {
		
		return userService.getUserByUsername(username);
	}
	
}
