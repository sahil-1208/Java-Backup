package com.learning.datasource;

import com.learning.model.UserDataModel;

public class UserDataSource {

	private UserDataModel[] userDataList;
	private int currentIndex;
	private int listSize;
	
	public UserDataSource() {
		this.listSize = 5;
		this.userDataList = new UserDataModel[listSize];
		this.currentIndex = 0;
	}
	
	public UserDataSource(int listSize) {
		this.listSize = listSize;
		this.userDataList = new UserDataModel[listSize];
		this.currentIndex = 0;
	}
	
	public long addData(UserDataModel userDataModel) {
		boolean isInValidSize = currentIndex >= (listSize/2);
		if (isInValidSize) {
			listSize = listSize * 2;
			UserDataModel[] newDataList = new UserDataModel[listSize];
			for (int index = 0; index < currentIndex; index++) {
				newDataList[index] = userDataList[index]; 
			}
			userDataList = newDataList;
		} 
		userDataList[currentIndex] = userDataModel;
		currentIndex++;
		return userDataModel.getUserId();
	}
	
	public UserDataModel getDataByIndex(int index) {
		UserDataModel userDataModel = userDataList[index];
		return userDataModel;
	}
	
	public boolean updateDataByIndex(int index, UserDataModel userDataModel) {
		userDataList[index] = userDataModel;
		return true;
	}
	
	public boolean deleteDataByIndex(int index) {
		userDataList[index] = null;
		return true;
	}
	
	public UserDataModel[] getAllData() {
		return userDataList;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public int getListSize() {
		return listSize;
	}

}
