package com.learning.datasource;

import com.learning.model.Account;

public class IciciDataSource {
	
	private int index;
	private int size;
	private Account[] accountArr;

	public IciciDataSource() {
		this.index = 0;
		this.size = 5;
		this.accountArr = new Account[this.size];
	}

	public boolean addAccount(Account account) {

		if (index == (size - 2)) {
			size = size * 2;
			Account[] newArr = new Account[size];
			for (int i = 0; i < index - 1; i++) {
				newArr[i] = accountArr[i];
			}
			accountArr = newArr;
			accountArr[index] = account;
			index++;
		} else {
			accountArr[index] = account;
			index++;
		}

		return true;

	}

	public Account[] listOfAccounts() {
		return accountArr;
	}
	
}
