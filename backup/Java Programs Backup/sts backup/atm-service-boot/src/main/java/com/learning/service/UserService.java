package com.learning.service;

import com.learning.enums.Status;
import com.learning.model.UserDataModel;
import com.learning.model.UserResponse;

public interface UserService {
	
	// By Default all method in interfaces will be public abstract 
	
	UserResponse addUser(UserDataModel userModel);
	public UserDataModel getUserById(long userId);
	public UserDataModel[] getAllUser();
	public Status updateUserById(long userId, UserDataModel userModel);
	public Status deleteUserById(long userId);
}
