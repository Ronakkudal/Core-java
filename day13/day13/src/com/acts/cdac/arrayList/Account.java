package com.acts.cdac.arrayList;

import java.time.LocalDate;
import java.util.Objects;

public class Account {
	private static long ctr =10000;
	private long accountNumber;
	private String name;
	private double balance;
	private LocalDate accountOpeningDate;
	private accountType type;

	public Account() {
		super();
	}

	public Account(String name, double balance, LocalDate accountOpeningDate ,  accountType type) {
		this.accountNumber = ctr++;
		this.name = name;
		this.balance = balance;
		this.accountOpeningDate = accountOpeningDate;
		this.type = type;
	}

	public accountType getType() {
		return type;
	}

	public static long getCtr() {
		return ctr;
	}

	public static void setCtr(long ctr) {
		Account.ctr = ctr;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getAccountOpeningDate() {
		return accountOpeningDate;
	}

	public void setAccountOpeningDate(LocalDate accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}

	

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ ", accountOpeningDate=" + accountOpeningDate + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, accountOpeningDate, balance, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accountNumber == other.accountNumber && Objects.equals(accountOpeningDate, other.accountOpeningDate)
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance)
				&& Objects.equals(name, other.name);
	}



}