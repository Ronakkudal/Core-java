package account;

import java.time.LocalDate;

public class SavingAccount extends Account {

	private int interestRate;
	
	public SavingAccount() {
		super();
		this.interestRate=1;
	}

	/**
	 * @param accNum
	 * @param name
	 * @param balance
	 * @param dateOfOpening
	 */
	public SavingAccount(String name, double balance, LocalDate dateOfOpening) {
		super(name, balance, dateOfOpening);
		this.interestRate=1;
		}

	@Override
	public double applyInterest() {
		double bal = this.getBalance();
		this.setBalance(bal+((bal*interestRate)/100));
		return this.getBalance();
	}

}
