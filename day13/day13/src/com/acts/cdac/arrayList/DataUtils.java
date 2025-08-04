package com.acts.cdac.arrayList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataUtils {
	public static void getDetailsFromUser(Scanner sc) {
		List<Account> accarr = new ArrayList<Account>();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter balance:");
		long bal = sc.nextLong();
		System.out.println("Enter date of opening in format YYYY-MM-DD:");
		String strDate=sc.next();
		LocalDate date = LocalDate.parse(strDate);  
		System.out.println("Enter acctype Saving or Current select 1 or 2:");
		int type = sc.nextInt();
		switch(type) {
		case 1: accarr.add(new SavingAccount(name,bal,date,accountType.SAVING));
				break;
		case 2 : accarr.add(new CurrentAccount(name,bal,date,accountType.CURRENT));
				break;
		}
		
	}

}
