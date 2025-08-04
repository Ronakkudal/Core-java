package account;

import java.time.LocalDate;

public class SavingsAccount extends Account implements Withdrawable, Depositable {
	private double rate = 3;
	private LocalDate date;
	
	public SavingsAccount() {
		super();
		this.rate = 3;
		this.date = LocalDate.now();
	}
	
	public SavingsAccount(String name, double balance, LocalDate date) {
		super(name, balance);
		this.date = date;
	}
	
	@Override
	public double deposit(double balance) {
		double newBalance = setBalance(balance);
		return newBalance;
	}

	@Override
	public double withdraw(double balance) {
		if(balance > getBalance()) {
			System.out.println("Low Balance!! Gareeb");
			return 0.0;
		}
		double bal = getBalance();
		double newBalance = bal - balance;
		return this.setBalance(newBalance);
	}
	
	public void interest() {
		double SI = (this.getBalance() * this.rate * this.getDate())/100;
		System.out.println("Simple Interest on your amount: " + SI);
	}
	
	//getter
	public double getInterest() { return this.rate ;}
	
	public int getDate() {
		return LocalDate.now().getYear() - this.date.getYear();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nInterest Rate: " + this.rate ;
	}
	
}
