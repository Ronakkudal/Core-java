package account;

import java.time.LocalDate;

public abstract class Account {
	private long accNum;
	private static long cntr = 10000;
	private String name;
	private double balance;
	private LocalDate dateOfOpening;
	/**
	 * @param accNum
	 * @param name
	 * @param balance
	 * @param dateOfOpening
	 */
	//Default constructor
	public Account() {
		super();
		this.accNum = cntr;
		this.name = "";
		this.balance = 0.0;
		this.dateOfOpening = null;
		cntr++;
	}
	/**
	 * 
	 */
	
	//Parameterized Constr
	public Account(String name, double balance, LocalDate dateOfOpening) {
		super();
		this.accNum = cntr;
		this.name = name;
		this.balance = balance;
		this.dateOfOpening = dateOfOpening;
		cntr++;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", name=" + name + ", balance=" + balance + ", dateOfOpening="
				+ dateOfOpening + "]";
	}
	
	public abstract double applyInterest() ;
	
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
	public long getAccNum() {
		return accNum;
	}
	
}
