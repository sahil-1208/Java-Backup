package com.learning.model;

import java.time.LocalDate;

public class UserDataModel {

	private long userId;
	private String userName;
	private String encryptedPassword;
	private LocalDate dob;
	private String mobileNumber;
	
	public UserDataModel() {
		
	}
	
	public UserDataModel(String userName, String encryptedPassword, String mobileNumber, LocalDate dob) {
		this.userName = userName;
		this.encryptedPassword = encryptedPassword;
		this.mobileNumber = mobileNumber;
		this.dob = dob;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	
}
