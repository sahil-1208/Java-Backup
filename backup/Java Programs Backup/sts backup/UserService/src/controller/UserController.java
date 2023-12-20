package controller;

import model.User;
import service.UserService;

public class UserController {

	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	public User getUser(int id) {
		return userService.getUser(id);
	}
	
	public User newUser(User user) {
		return userService.createUser(user);
	}
	
	public void deleteUser(int id) {
		userService.deleteUser(id);
	}
}
