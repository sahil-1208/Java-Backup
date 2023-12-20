package com.learning.service;

import com.learning.model.Account;

public abstract class AtmService {
	
	public abstract double withdraw(Account account, double amount);
	
	public abstract double deposit(Account account, double amount);
	
	public abstract double showBalance(Account account);
	
	public abstract boolean changePin(Account account, int password);
	
	public abstract boolean addAccount(Account account);

}
