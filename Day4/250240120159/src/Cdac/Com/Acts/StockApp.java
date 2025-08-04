package Cdac.Com.Acts;
import java.util.Scanner;
import java.time.LocalDate;
import java.io.*;
import java.util.*;


public class StockApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StockManager manager = new StockManager();
		boolean running = true;

		while (running) {
			System.out.println("******Choose the Given Opetion******\n");
		
			System.out.println("1. Add Transaction");
			System.out.println("2. Remove Transaction");
			System.out.println("3. Display Transactions Sorted By Date");
			System.out.println("4. Filter Transactions By Symbol");
			System.out.println("5. Save Transactions to File");
			System.out.println("6. Load Transactions from File");
			System.out.println("7. Exit");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter details: ID, Symbol, Quantity, Price, Date (yyyy-mm-dd), Type (BUY/SELL)");
				int id = sc.nextInt();
				String symbol = sc.next();
				int quantity = sc.nextInt();
				double price = sc.nextDouble();
				LocalDate date = LocalDate.parse(sc.next());
				TranType type = TranType.valueOf(sc.next().toUpperCase());
				try {
					manager.addTransaction(new Stock(id, symbol, quantity, price, date, type));
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Enter Transaction ID to remove:");
				int transId = sc.nextInt();
				manager.removeTransaction(transId);
				break;
			case 3:
				manager.displayTransactionsSortedByDate();
				break;
			case 4:
				System.out.println("Enter Symbol:");
				String filterSymbol = sc.next();
				manager.filterTransactionsBySymbol(filterSymbol);
				break;
			case 5:
				System.out.println("Enter file name to save:");
				String saveFile = sc.next();
				try {
					manager.saveToFile(saveFile);
				} catch (IOException e) {
					System.out.println("Error saving to file: " + e.getMessage());
				}
				break;
			case 6:
				System.out.println("Enter file name to load:");
				String loadFile = sc.next();
				try {
					manager.loadFromFile(loadFile);
				} catch (IOException | ClassNotFoundException e) {
				System.out.println("Error loading from file: " + e.getMessage());
			}
			break;
		 	case 7:
		 		System.out.println("Exiting...");
		 		running = false;
			    break;
		 	default:
			
		 		System.out.println("Invalid choice. Please try again.");
			   }
		    }
	           sc.close();
	}
}



