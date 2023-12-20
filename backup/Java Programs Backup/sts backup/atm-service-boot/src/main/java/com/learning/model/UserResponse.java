package com.learning.model;

import com.learning.enums.Status;

public class UserResponse {

	private Status status;
	private long userId;

	public UserResponse(long userId, Status status) {
		this.userId = userId;
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}
