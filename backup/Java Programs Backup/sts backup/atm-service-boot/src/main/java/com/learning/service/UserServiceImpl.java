package com.learning.service;

import org.springframework.stereotype.Service;

import com.learning.datasource.UserDataSource;
import com.learning.enums.Status;
import com.learning.model.UserDataModel;
import com.learning.model.UserResponse;

@Service
public class UserServiceImpl implements UserService {

	private final UserDataSource userDataSource;
	
	public UserServiceImpl() {
		this.userDataSource = new UserDataSource();
	}
	
	@Override
	public UserResponse addUser(UserDataModel userModel) {
		int currentIndex = userDataSource.getCurrentIndex();
		if (currentIndex == 0) {
			userModel.setUserId(101);			
		} else {
			UserDataModel existingUserData = userDataSource.getDataByIndex(currentIndex-1);
			if (null != existingUserData) {
				userModel.setUserId(existingUserData.getUserId() + 1);	
			}
		}
		long userId = userDataSource.addData(userModel);
		return new UserResponse(userId, Status.SUCCESS);
	}
	
	@Override
	public UserDataModel getUserById(long userId) {
		UserDataModel[] dataList = userDataSource.getAllData();
		for (int index = 0; index < userDataSource.getCurrentIndex(); index++) {
			UserDataModel userDataModel = dataList[index]; 
			if (userDataModel.getUserId() == userId) {
				return userDataModel;
			}
		}
		return null;
	}
	
	@Override
	public UserDataModel[] getAllUser() {
		return userDataSource.getAllData();
	}

	@Override
	public Status updateUserById(long userId, UserDataModel updateUserModel) {
		int index = getIndexByUserId(userId);
		if (index != (-1)) {
			UserDataModel savedUser = userDataSource.getDataByIndex(index);
			savedUser.setUserName(updateUserModel.getUserName());
			savedUser.setMobileNumber(updateUserModel.getMobileNumber());
			if (userDataSource.updateDataByIndex(index, savedUser)) {
				return Status.SUCCESS;	
			}
		}
		return Status.FAILED;
	}

	@Override
	public Status deleteUserById(long userId) {
		int index = getIndexByUserId(userId);
		if (index != (-1)) {
			if (userDataSource.deleteDataByIndex(index)) {
				return Status.SUCCESS;	
			}
		}
		return Status.FAILED;
	}
	
	private int getIndexByUserId(long userId) {
		UserDataModel[] dataList = userDataSource.getAllData();
		for (int index = 0; index < userDataSource.getCurrentIndex(); index++) {
			UserDataModel existingUser = dataList[index]; 
			if (existingUser.getUserId() == userId) {
				return index;
			}
		}
		return -1;
	}

}
