package com.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.datasource.HdfcDataSource;
import com.learning.model.Account;
import com.learning.service.AtmService;
import com.learning.service.HdfcService;

@RestController
@RequestMapping("/hdfc")
public class HdfcController {
	
	private HdfcDataSource hdfcDataSource;
	private AtmService atmService;
	
	public HdfcController() {
		// Parent Reference and Child Object | Runtime Polymorphism
		this.atmService = new HdfcService();
	}
	
	@GetMapping
	public double withDrawBalance(@RequestParam String name, @RequestParam int password) {
		
		Account account = validateHdfcAccount(name, password);
		if(account != null) {
			if(name == account.getName() && password == account.getPassword()) {
				double withDrawaAmount = atmService.withdraw(account, 300);
				System.out.println("withDrawaAmount " + withDrawaAmount);
				return withDrawaAmount;	
			}
		} else {
			System.out.println("Withdrawl fail");
		}
		return 0;
		}
		

	
	@PostMapping
	public boolean createAccount(@RequestBody Account account) {
		return atmService.addAccount(account);
	}

	private Account validateHdfcAccount(String name, int password) {
		Account account = null;
		Account[] accounts = hdfcDataSource.listOfAccounts();
		for(int i = 0; i <= accounts.length; i++) {
			account = accounts[i];
		}
		return account;
		
	}
	
}







