package day5.dayfive;

import java.util.Scanner;

public class Main {
	
	static int count = 0;
	static Account[] account = new Account[100];
	
	static void addAccount(Scanner sc) {
		System.out.println("Enter the Account Id: ");
		int accId = sc.nextInt();
		
		System.out.println("Enter the Account Holder name: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Enter the Account Balance: ");
		double balance = sc.nextDouble();
		
		Account acc = new Account(name, accId, balance);
		account[count++] = acc;
		System.out.println("Account added successfully!");
	}
	
	static void display(Scanner sc) {
		System.out.println("Display Balance: ");
		System.out.println("Enter Account No:");
		int accId = sc.nextInt();
		boolean found = false;
		for(int i = 0; i < count; i++) {
			if(accId == account[i].getAccId()) {
				found = true;
				System.out.println(account[i]);
				}
			}
		if(found != true) {
			System.out.println("Account not found!");
		}
	}
	
	static void withdraw(Scanner sc) {
		System.out.println("Withdraw Amount");
		System.out.println("Enter Account No: ");
		int accId = sc.nextInt();
		boolean found = false;
		for(int i = 0; i < count; i++) {
			if(accId == account[i].getAccId()) {
				found = true;
				System.out.println(account[i]);
				
				System.out.println("Enter amount you want to withdraw:");
				double balance = sc.nextDouble();	
				if(balance > account[i].getBalance()) {
					System.out.println("Insufficient Balance!!");
					break;
				}
				double newBalance = account[i].getBalance() - balance;
				newBalance = account[i].setBalance(newBalance);
				System.out.println(account[i]);
				break;
				}
			}
		
		if(found != true) {
			System.out.println("Account not found!");
		}
	}
	
//	public static void checkIfExists(Scanner sc, int accId) {
//		boolean found = false;
//		for(int i = 0; i < count; i++) {
//			if(accId == account[i].getAccId()) {
//				found = true;
//				System.out.println(account[i]);
//				break;
//				}
//			}
//			if(found != true) {
//			System.out.println("Account not found!");
//			}
//	}
	
	public static void transfer(Scanner sc) {
		
		 	System.out.println("Transfer Amount:");
		    
		    System.out.println("Enter your Account Id: ");
		    int accId1 = sc.nextInt();

		    Account sender = null;
		    for (int i = 0; i < count; i++) {
		        if (account[i].getAccId() == accId1) {
		            sender = account[i];
		            break;
		        }
		    }
		    if (sender == null) {
		        System.out.println("Sender's account not found!");
		        return;
		    }

		    System.out.println("Enter Receiver's Account Id: ");
		    int accId2 = sc.nextInt();

		    Account receiver = null;
		    for (int i = 0; i < count; i++) {
		        if (account[i].getAccId() == accId2) {
		            receiver = account[i];
		            break;
		        }
		    }
		    if (receiver == null) {
		        System.out.println("Receiver's account not found!");
		        return;
		    }

		    System.out.println("Enter Amount to Transfer:");
		    double amount = sc.nextDouble();

		    if (amount > sender.getBalance()) {
		        System.out.println("Insufficient balance! Transfer failed.");
		        return;
		    }

		    sender.setBalance(sender.getBalance() - amount);
		    receiver.setBalance(receiver.getBalance() + amount);

		    System.out.println("Transfer successful!");
		    System.out.println("Sender's new balance: " + sender.getBalance());
		    System.out.println("Receiver's new balance: " + receiver.getBalance());
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		//Account[] account = new Account[100];
		do {
			System.out.println("******MENU******");
			System.out.println("1. Add Account");
			System.out.println("2. Display Balance");
			System.out.println("3. Withdraw");
			System.out.println("4. Transfer");
			System.out.println("5. Exit");
			
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				addAccount(sc);
				break;
			
			case 2:
				display(sc);
				break;
				
			case 3:
				withdraw(sc);
				break;
				
			case 4: 
				transfer(sc);
				break;
			}
			
		}while(choice != 5);
	}
}
