package account;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2023, 1, 1);
		SavingsAccount saving = new SavingsAccount("Otat ME!", 20000, date);
		saving.withdraw(1000);
		saving.deposit(200000);
		System.out.println(saving.toString());
		
		/*Withdrawable saving = new SavingsAccount("Otat ME!", 20000, date);
		saving.withdraw(1000);
		System.out.println(saving);
		
		Depositable deposit = new SavingsAccount("Otat ME!", 20000, date);
		deposit.deposit(200000);
		//System.out.println(saving);
		*/
		
		FixedDeposit fixed = new FixedDeposit("Otat ME!", 20000, date);
		System.out.println(fixed.getBalance());
		double CI = fixed.calculateMaturityAmount(fixed.deposit(10000));
		System.out.println(fixed.getBalance());
		System.out.println("Compound Interest : " + CI);
	}
}
