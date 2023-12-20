package com.learning.consumer;

import com.learning.enums.AccountType;
import com.learning.model.AccountDetails;
import com.learning.model.BalanceShow;
import com.learning.service.Services;

import implementation.ServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		BalanceShow balanceShow = new BalanceShow();
		
		balanceShow.setBalance(50000);
		
		AccountDetails accountDetails = new AccountDetails(); 
		
		
		accountDetails.setPin(2262);
		accountDetails.setUserName("Arjun");
		accountDetails.setAccountType(AccountType.SAVINGS);
		accountDetails.setAccountNumber(124884000051511l);
		accountDetails.setIfsc("SBIN01000122");
		
		Services services = new ServiceImpl();
		
		
		
		services.showBalance(balanceShow, accountDetails);
	}
	
	
}
