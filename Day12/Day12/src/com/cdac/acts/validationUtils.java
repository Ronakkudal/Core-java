package com.cdac.acts;
import java.time.LocalDate;

public class validationUtils {
	public static final double MIN_BALANCE = 1000.00;

	public static LocalDate validDate(String strdoo) throws DateValidationException {
		LocalDate myDate = LocalDate.parse(strdoo);
		LocalDate today = LocalDate.now();
		
		if(myDate.isAfter(today)) {
			throw new DateValidationException("future date not allow...");
		}
		return myDate;
		
	}
	public static double validationBalance(double balance) throws MinBalanceException {
		if(balance<MIN_BALANCE) {
			throw new MinBalanceException("Balance low than min balance..");
		}
		return balance;
	}
}
