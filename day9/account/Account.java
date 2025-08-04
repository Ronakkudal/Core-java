package account;

public class Account {
	private int accNo;
	private String name;
	private double balance;
	
	static int autoIncrement = 100;
	
	public Account() {
		this.accNo = autoIncrement++;
		this.name = "";
		this.balance = 0.0;
	}
	
	public Account(String name, double balance) {
		this.accNo = autoIncrement++;
		this.name = name;
		this.balance = balance;
	}
	
	//getters
	public int getID() {return this.accNo;}
	public String getName() {return this.name;}
	public double getBalance() {return this.balance;}
	
	//setters
	public void setName(String name) {this.name = name;}
	
	public double setBalance(double balance) {
		return this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "\nAccount Id: " + this.accNo + "\nAccount Holder's Name: " + this.balance + "\nBalance: " + this.balance;
	}

}
/*
Assignment 1:
Create Depositable, Withdrwable , Maturable interfaces with methods.
Implement these interfaces in Account class hierarchy.
1) Depositable I/F
double depoist(double)
2) Withdrwable
double withdraw(double)
3) Muturable
double calculateMatutyAmount(double)
*/