package com.learning.service;

import org.springframework.stereotype.Service;

import com.learning.datasource.HdfcDataSource;
import com.learning.model.Account;

@Service
public class HdfcService extends AtmService {

//	private ReuseMethods reuseMethods;
	private HdfcDataSource hdfcDataSource;

	public HdfcService() {
		this.hdfcDataSource = new HdfcDataSource();
	}

	/*
	 * Steps
	 * 
	 * Get Account List 
	 * Iterate accountArray 
	 * validate account (number and password)
	 * validate balance in account 
	 * withdraw
	 */
	 // yha aur bta de
	@Override
	public double withdraw(Account account, double amount) {
	Account storeAccount = validateAccount(account);
		if(storeAccount != null) {
	double	storeAmount = storeAccount.getBalance();
			if (amount <= storeAmount) {
				storeAmount = storeAmount - amount;
				account.setBalance(storeAmount);
				System.out.println("Withdrawal success available amount " + storeAmount);
				return amount;
			} else {
				System.out.println("Withdrawal fail");
				return 0;
			}
		}
		//double storeAmount = reuseMethods.bankService(account, amount);
//		Account[] accountArray = hdfcDataSource.listOfAccounts();
//
//		for (int index = 0; index < accountArray.length; index++) {
//
//			Account storedAccount = accountArray[index];
//
//			boolean numberValidation = storedAccount.getNumber() == account.getNumber();
//			boolean passwordValidation = storedAccount.getPassword() == account.getPassword();
		//return storeAmount;
		return amount;

			//if (numberValidation && passwordValidation) {
				//double storedBalance = storedAccount.getBalance();

				
			}
		
	
	@Override
	public double deposit(Account account, double amount) {
		validateAccount(account);
//		Account[] accountArray = hdfcDataSource.listOfAccounts();
//		for (int index = 0; index < accountArray.length; index++) {
//			Account storedAccount = accountArray[index];
//			boolean numberValidation = storedAccount.getNumber() == account.getNumber();
//			boolean passwordValidation = storedAccount.getPassword() == account.getPassword();
//		
//			if (numberValidation && passwordValidation) {
//				double storedBalance = storedAccount.getBalance();
//				storedBalance = storedBalance + amount;
//				storedAccount.setBalance(storedBalance);
//				System.out.println("Deposit success available balance " + storedBalance);
//				return amount;
//			}
//		}
//		System.out.println("Withdrawal fail");
		return 0;
	}

	@Override
	public double showBalance(Account account) {
		Account[] accountArray = hdfcDataSource.listOfAccounts();
		for (int index = 0; index < accountArray.length; index++) {
			Account storedAccount = accountArray[index];
			boolean numberValidation = storedAccount.getNumber() == account.getNumber();
			boolean passwordValidation = storedAccount.getPassword() == account.getPassword();
			if (numberValidation && passwordValidation) {
				double storedBalance = storedAccount.getBalance();
				System.out.println("Available balance " + storedBalance);
				return storedBalance;
			}
		}
		System.out.println("Invalid Account");
		return 0;
	}

	@Override
	public boolean changePin(Account account, int password) {
		Account[] accountArray = hdfcDataSource.listOfAccounts();
		for (int index = 0; index < accountArray.length; index++) {
			Account storedAccount = accountArray[index];
			boolean numberValidation = storedAccount.getNumber() == account.getNumber();
			boolean passwordValidation = storedAccount.getPassword() == account.getPassword();
			if (numberValidation && passwordValidation) {
				storedAccount.setPassword(password);
				System.out.println("Pin changed ");
				return true;
			} 
		}
		System.out.println("fail");
		return false;
	}

	@Override
	public boolean addAccount(Account account) {
		return hdfcDataSource.addAccount(account);
	}

	private Account validateAccount(Account account) {

		Account[] accountArray = hdfcDataSource.listOfAccounts();
		for (int index = 0; index < accountArray.length; index++) {
			Account storedAccount = accountArray[index];

			boolean numberValidation = storedAccount.getNumber() == account.getNumber();
			boolean passwordValidation = storedAccount.getPassword() == account.getPassword();
			if (numberValidation && passwordValidation) {
				double storedBalance = storedAccount.getBalance();
				return storedAccount;
			}

		}
		return null;
	}
}
