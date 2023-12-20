package implementation;

import com.learning.model.AccountDetails;
import com.learning.model.BalanceShow;
import com.learning.service.Services;

public class ServiceImpl extends Services {

	public static final long PIN = 2262;

	@Override
	public void showBalance(BalanceShow balanceShow, AccountDetails accountDetails) {

		// long p = accountDetails.getPin();

		if (accountDetails.getPin() == PIN) {

			System.out.println(accountDetails.getUserName());
			System.out.println(accountDetails.getAccountNumber());
			System.out.println(accountDetails.getIfsc());
			System.out.println(balanceShow.getBalance());

			System.out.println("Transaction Complete");

		} else {

			System.out.println("Transaction Denied");
		}

	}

}