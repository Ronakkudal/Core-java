package day5.dayfive;

public class Account {
	private int accId;
	private double balance;
	private String name;
	
	public Account() {
		this.name = "";
		this.accId = 0;
		this.balance = 0.0;
	}
	
	public Account(String name, int accId, double balance) {
		this.name = name;
		this.accId = accId;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account Name: " + this.name + "\n AccountId: " + this.accId + "\n Balance: " + this.balance;
	}
	
	public int getAccId() { return this.accId; }
	
	public double getBalance() { return this.balance; }
	
	public double setBalance(double bal) { return this.balance = bal; }
}
