package service;

import model.User;
import repository.UserRepo;

public class UserService {

	private final UserRepo userRepo;
	
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	public User createUser(User user) {
	User createdUser =	userRepo.save(user);
		return createdUser;
	}
	
	public User getUser(int id) {
		return userRepo.findById(id);
	}
	
	public void deleteUser(int id) {
		 userRepo.deleteById(id);
	}
	
}
