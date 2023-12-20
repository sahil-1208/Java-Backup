package datasource;

import model.Account;

public class HdfcDataSource {


	public Account[] listOfAccounts() {

		// (long number, String name, double balance, int password)
		Account isha = new Account(101010, "Isha", 999999.00, 1234);
		Account akshat = new Account(101011, "Akshat", 50456.00, 0000);
		Account palak = new Account(101012, "Palak", 3737900.00, 9999);
		Account doremon = new Account(1010103, "Doremon", 128383.00, 8989);

		Account[] accountArray = { isha, akshat, palak, doremon };
		return accountArray;
	}

	// Hint
//	String[] shdh() {
//
//		String[] arr = { "name" };
//
//		String data = arr[0];
//		return arr;
	}


