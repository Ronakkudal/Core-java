package account.tester;
import java.util.Scanner;

import account.Account;
import account.CurrentAccount;
import account.DepositAccount;
import account.SavingAccount;

import java.time.LocalDate;

public class BankSystem {
    public static void main(String[] args) {
        Account[] accounts = new Account[5];
        Scanner scanner = new Scanner(System.in);
        int accountCount = 5;
        // Initialize accounts array (Upcasting occurs here)
        accounts[0] = new SavingAccount("Pranay", 7777777, LocalDate.of(1999, 10, 2));
        accounts[1] = new CurrentAccount("Ronak", 7777777, LocalDate.of(2000, 1, 31));
        accounts[2] = new DepositAccount("Sanket", 7777777, LocalDate.of(2008, 2, 3));
        accounts[3] = new CurrentAccount("SleepyboyRonak", 7777777, LocalDate.of(2007, 12, 23));
        accounts[4] = new SavingAccount("Raghav", 7777777, LocalDate.of(2023, 10, 30));
        
        while (true) {
            System.out.println("\nBank System Menu:");
            System.out.println("1. Display all accounts");
            System.out.println("2. Apply interest to all accounts");
            System.out.println("3. Add new account");
            System.out.println("4. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // Dynamic method dispatch occurs here
                    for (Account account : accounts) {
                        System.out.println(account.toString());
                    }
                    break;
                    
                case 2:
                    // Dynamic method dispatch occurs here
                    for (Account account : accounts) {
                        System.out.println("Interest applied to " + account.getName() + 
                                         ": " + account.applyInterest());
                    }
                    break;
                    
                case 3:
                    if (accountCount < accounts.length) {
                        System.out.println("\nAdd New Account:");
                        System.out.print("Enter account holder name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter initial balance: ");
                        double balance = scanner.nextDouble();
                        System.out.print("Enter date of opening (YYYY-MM-DD): ");
                        String dateStr = scanner.next();
                        LocalDate dateOfOpening = LocalDate.parse(dateStr);
                        scanner.nextLine(); // Consume the newline

                        System.out.println("Select account type:");
                        System.out.println("1. Saving Account");
                        System.out.println("2. Current Account");
                        System.out.println("3. Deposit Account");
                        System.out.print("Enter your choice: ");
                        int accountTypeChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline

                        Account newAccount = null;
                        switch (accountTypeChoice) {
                            case 1:
                                newAccount = new SavingAccount(name, balance, dateOfOpening);
                                break;
                            case 2:
                                newAccount = new CurrentAccount(name, balance, dateOfOpening);
                                break;
                            case 3:
                                newAccount = new DepositAccount(name, balance, dateOfOpening);
                                break;
                            default:
                                System.out.println("Invalid account type choice.");
                        }

                        if (newAccount != null) {
                            accounts[accountCount++] = newAccount;
                            System.out.println("New account added successfully.");
                        }
                    } else {
                        System.out.println("Maximum number of accounts reached.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using Bank System!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}