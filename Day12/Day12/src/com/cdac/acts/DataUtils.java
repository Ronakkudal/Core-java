package com.cdac.acts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DataUtils {
	public static List<Account> getAccData(Scanner sc){
		List <Account> list = new ArrayList<>();
		System.out.println("No. of accounts");
		int size = sc.nextInt();
		
		while(size!=0) {
			sc.nextLine();
			System.out.println("Enter name of the account holder");
			String acname = sc.nextLine();
		
			System.out.println("Enter Date of Opening in format YYYY-MM-DD");
			String date = sc.next();
			
			//Object validationUtils;
			LocalDate dOO = null;

			try {
				dOO = validationUtils.validDate(date);
			} catch (DateValidationException e) {
				System.err.println(e.getMessage());
			}

			System.out.println("Enter opening balance of the account holder");
			double bal = sc.nextDouble();
			double balance =0.0;
			try {
				balance =validationUtils.validationBalance(bal);
			} catch (MinBalanceException e) {
				System.err.println(e.getMessage());
			}
			
			list.add(new Account(acname,dOO,balance));
			size--;
		}

		return list;
		
		
		
		
	}
}
