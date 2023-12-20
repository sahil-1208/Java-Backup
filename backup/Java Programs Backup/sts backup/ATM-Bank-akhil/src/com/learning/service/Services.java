package com.learning.service;

import com.learning.model.AccountDetails;
import com.learning.model.BalanceShow;
import com.learning.model.Withdraw;

public abstract class Services {
	
	
	public abstract void showBalance(BalanceShow balanceShow, AccountDetails accountDetails);
	public abstract int showDeductedAmount(BalanceShow balanceShow,Withdraw withdraw);
}


