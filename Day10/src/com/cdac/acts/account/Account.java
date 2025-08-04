package com.cdac.acts.account;

import java.time.LocalDate;

import com.cdac.acts.account.exceptions.MinBalException;

public class Account {
	private int accNO;
	private String accName;
	private LocalDate doo;
	private double bal;
	private static final int MIN_BALANCE=1000;
	private static int accGen=1;
	public Account() {
		
	}

	public Account(String accName, double bal) {
		super();
		this.accNO = accGen++;
		this.accName = accName;
		this.doo = LocalDate.now();
		this.bal = bal;
	}

	public int getAccNO() {
		return accNO;
	}

	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public LocalDate getDOO() {
		return doo;
	}

	public void setDOO(LocalDate doo) {
		this.doo = doo;
	}

	public double getBal() {
		return bal;
	}

	public double setBal(double bal) {
		return this.bal = bal;
	}
	public double withdraw(double amt)throws MinBalException {
		if(getBal()-amt<MIN_BALANCE) {
			throw new MinBalException("Minimum value limit error");
		}
		return	setBal(getBal()-amt);
	}
	@Override
	public String toString() {
		return "Account [accNO=" + accNO + ", accName=" + accName + ", doo=" + doo + ", bal=" + bal + "]";
	}
	

}
