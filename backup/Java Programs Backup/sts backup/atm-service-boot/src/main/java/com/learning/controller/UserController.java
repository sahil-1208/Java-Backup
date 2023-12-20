package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.enums.Status;
import com.learning.model.UserDataModel;
import com.learning.model.UserResponse;
import com.learning.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	// Spring will automatically create implementation object and assign to reference variable
	@Autowired
	private UserService userService;
	
	@PostMapping
	public UserResponse addUserApi(@RequestBody UserDataModel userModel) {
		return userService.addUser(userModel);
	}
	
	@GetMapping
	public UserDataModel getUserApi(@RequestParam(name = "userId") long userId) {
		return userService.getUserById(userId);
	}
	
	@GetMapping("/all")
	public UserDataModel[] getAllUserApi() {
		return userService.getAllUser();
	}
	
	@PutMapping
	public Status updateUserApi(@RequestParam(name = "userId") long userId,
			@RequestBody UserDataModel userModel) {
		return userService.updateUserById(userId, userModel);
	}
	
	@DeleteMapping
	public Status deleteUserApi(@RequestParam(name = "userId") long userId) {
		return userService.deleteUserById(userId);
	}
}
