package account;
import java.time.LocalDate;
public class DepositAccount extends Account {
	
	//Interest Rate in %
	private int interestRate;
	
	public DepositAccount() {
		super();
		this.interestRate=8;
		}

	/**
	 * @param accNum
	 * @param name
	 * @param balance
	 * @param dateOfOpening
	 */
	public DepositAccount(String name, double balance, LocalDate dateOfOpening) {
		super(name, balance, dateOfOpening);
		this.interestRate=8;
		}

	@Override
	public double applyInterest() {
		double bal = this.getBalance();
		this.setBalance(bal+((bal*interestRate)/100));
		return this.getBalance();
	}

}
