package com.learning.test;

import com.learning.model.Account;

public class Test {

	public static void main(String[] args) {
		DyanmicAccount dynamicAccount = new DyanmicAccount();
		Account aditi = new Account(4325678, "Aditi", 999999.00, 9090);
		Account sadaf = new Account(523647, "Sadaf", 50456.00, 2830);
		Account aarnav = new Account(9273737, "Aarnav", 3737900.00, 8374);
		Account vansh = new Account(8623458, "Vansh", 128383.00, 8989);
		Account prabh = new Account(1010103, "Prabhjeet", 737363.00, 3546);
		Account yuvraj = new Account(8623459, "Yuvraj", 9238393.00, 1984);
		Account akhil = new Account(1010103, "Akhil", 8373838.00, 7982);
		Account sahil = new Account(4325698, "Sahil", 26363654.00, 7302);
		
		dynamicAccount.addAccount(aditi);
		dynamicAccount.addAccount(sadaf);
		dynamicAccount.addAccount(aarnav);
		dynamicAccount.addAccount(vansh);
		dynamicAccount.addAccount(prabh);
		
		dynamicAccount.addAccount(aditi);
		dynamicAccount.addAccount(sadaf);
		dynamicAccount.addAccount(aarnav);
		dynamicAccount.addAccount(vansh);
		dynamicAccount.addAccount(prabh);
		
		
		dynamicAccount.addAccount(aditi);
		dynamicAccount.addAccount(sadaf);
		dynamicAccount.addAccount(aarnav);
		dynamicAccount.addAccount(vansh);
		dynamicAccount.addAccount(prabh);
		
		dynamicAccount.addAccount(aditi);
		dynamicAccount.addAccount(sadaf);
		dynamicAccount.addAccount(aarnav);
		dynamicAccount.addAccount(vansh);
		dynamicAccount.addAccount(prabh);
		
		
		dynamicAccount.addAccount(aditi);
		dynamicAccount.addAccount(sadaf);
		dynamicAccount.addAccount(aarnav);
		dynamicAccount.addAccount(vansh);
		dynamicAccount.addAccount(prabh);
		
		
		dynamicAccount.addAccount(aditi);
		dynamicAccount.addAccount(sadaf);
		dynamicAccount.addAccount(aarnav);
		dynamicAccount.addAccount(vansh);
		dynamicAccount.addAccount(prabh);
		
		dynamicAccount.addAccount(aditi);
		dynamicAccount.addAccount(sadaf);
		dynamicAccount.addAccount(aarnav);
		dynamicAccount.addAccount(vansh);
		dynamicAccount.addAccount(prabh);
		
		dynamicAccount.addAccount(aditi);
		dynamicAccount.addAccount(sadaf);
		dynamicAccount.addAccount(aarnav);
		dynamicAccount.addAccount(vansh);
		dynamicAccount.addAccount(prabh);
		
		dynamicAccount.addAccount(aditi);
		dynamicAccount.addAccount(sadaf);
		dynamicAccount.addAccount(aarnav);
		dynamicAccount.addAccount(vansh);
		dynamicAccount.addAccount(prabh);
		
		dynamicAccount.addAccount(aditi);
		dynamicAccount.addAccount(sadaf);
		dynamicAccount.addAccount(aarnav);
		dynamicAccount.addAccount(vansh);
		dynamicAccount.addAccount(prabh);
		
		dynamicAccount.addAccount(aditi);
		dynamicAccount.addAccount(sadaf);
		dynamicAccount.addAccount(aarnav);
		dynamicAccount.addAccount(vansh);
		dynamicAccount.addAccount(prabh);
		
		
		int length = dynamicAccount.getAccounts().length;
		
		System.out.println(length);
	}

}

class DyanmicAccount {

	private int index;
	private int size;
	private Account[] accountArr;

	public DyanmicAccount() {
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

	public Account[] getAccounts() {
		return accountArr;
	}
}
