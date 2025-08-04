package com.acts.cdac.arrayList;

import java.util.List;

public class AccountUtils {

		private AccountUtils() {
			
		}
		public static void findAccount(Long a, List<Account> accounts) throws AccountNotFoundException{
			for(Account ac : accounts) {
				if(ac.getAccountNumber()==a) {
					System.out.println(ac.toString());
					return;
					//return ac.getAccountNumber();
				}
			}
			throw new AccountNotFoundException("Account no not exists");
		}
		public static void checkBalance(Account a) throws MinBalanceException{
			final double MIN_BALANCE = 3000;
			if(a.getBalance()>MIN_BALANCE) {
				return;
			}
			throw new MinBalanceException("Balance low");
		}
}
