package com.acts.cdac.arrayList;

import java.time.LocalDate;

public class SavingAccount extends Account {
	private int ROI;
	//healthin
	public SavingAccount(String name, double balance, LocalDate accountOpeningDate,accountType type) {
		super(name, balance, accountOpeningDate,type);
		System.out.println("Creating Saving account");
		this.ROI = 3;
	}
	
	
}
