package com.cdac.acts;

import java.time.LocalDate;

public class Account {
	private static long ctr =1000;
	private long accNo ;
	private String accName;
	private LocalDate dateOfOpening;
	private double balance;
	public Account() {
		super();
	}
	public Account( String accName, LocalDate dateOfOpening, double balance) {
		super();
		this.accNo = ctr++;
		this.accName = accName;
		this.dateOfOpening = dateOfOpening;
		this.balance = balance;
		
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getAccNo() {
		return accNo;
	}
	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", dateOfOpening=" + dateOfOpening + ", balance="
				+ balance + "]";
	}
	
	
}
