package account;

import java.time.LocalDate;

public class FixedDeposit extends Account implements Maturable, Depositable {
	private double rate = 7;
	private LocalDate date;
	
	public FixedDeposit() {
		super();
		this.rate = 8;
		this.date = LocalDate.now();
	}
	
	public FixedDeposit(String name, double balance, LocalDate date) {
		super(name, balance);
		this.date = date;
	}
	
	@Override
	public double calculateMaturityAmount(double balance) {
		// CI = P(1 + r/100)^T - P
		int teme = LocalDate.now().getYear() - this.date.getYear();
		double P = this.getBalance();
		double rate = Math.pow((1 + this.rate/100), teme) ;
		double amount = P * rate;
		double CI = amount - P; 
		return CI;
	}
	
	@Override
	public double deposit(double balance) {
		double newBalance = setBalance(balance);
		return newBalance;
	}
	
	public int getDate() {
		return LocalDate.now().getYear() - this.date.getYear();
	}

	@Override
	public String toString() {
		return super.toString() + "\nInterest Rate: " + this.rate ;
	}
}
