package com.acts.cdac.arrayList;

import java.time.LocalDate;

public class CurrentAccount extends Account{
	private int ROI;
	//gstno
	public CurrentAccount(String name, double balance, LocalDate accountOpeningDate,accountType type) {
		super(name, balance, accountOpeningDate,type);
		System.out.println("Creating Current account");
		this.ROI = 1;
	}
}
