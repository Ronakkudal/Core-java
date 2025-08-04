
package account;

import java.time.LocalDate;

public class CurrentAccount extends Account {
	
	//Interest Rate in %
	private int interestRate;
	
	public CurrentAccount() {
		super();
		this.interestRate=1;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accNum
	 * @param name
	 * @param balance
	 * @param dateOfOpening
	 */
	public CurrentAccount(String name, double balance, LocalDate dateOfOpening) {
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
