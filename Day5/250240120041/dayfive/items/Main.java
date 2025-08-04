package day5.items;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static Item[] item = new Item[]{
		new Item("pencil", "Natraaaj", 10, 100),
		new Item("pen", "Trimax", 90, 50),
		new Item("register", "Classmate", 80, 100),
		new Item("book", "Core Java", 5000, 20)
	};
	
	static Item[] customer = new Item[20];
	
	static void displayStock() {
		for(Item items: item) {
			System.out.println(items);
			System.out.println();
		}
	}
	
	static void buyItem(Scanner sc) {
		System.out.println("Enter the item code you want to buy: (pencil, pen, register, nameSlip) ");
		sc.nextLine();
		String itemCode = sc.nextLine();
	
		Item product;
		boolean found = false;
		//System.out.println(item.length);
		for(int i = 0; i < item.length; i++) {
		
			if (itemCode.equals(item[i].getItemCode())) {
			
				found = true;
				product = item[i];
				System.out.println(product);
				
				System.out.println("Enter quantity: ");
				int quantity = sc.nextInt();
				
				if(quantity > product.getQuantity()) {
					System.out.println("Abhi maal aaega!");
					break;
				}
				int newQauntity = product.getQuantity() - quantity;
				item[i].setQuantity(newQauntity);
				
				Item i1 = new Item(product.getItemCode(), product.getItemName(), product.getPrice()*quantity, quantity);
				customer[i] = i1;
				//System.out.println(customer[i]);
				break;
			}
		}
		 
		if(found != true) {
			System.out.println("Item not found!!");
		}
	}
	
	static void generateBill(Scanner sc) {
		System.out.println("Generating Bill!");
		int price = 0;
		
		for(int i = 0; i < customer.length; i++) {
			if(customer[i] == null) {continue;}

			 Item item = customer[i];
		        System.out.println("Item: " + item.getItemCode()
                + ", Quantity: " + item.getQuantity()
                + ", Price: ₹" + item.getPrice());
		        price += item.getPrice();
		}
		System.out.println("Your Total Bill: " + price);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			
			System.out.println("! Welcome to Stationary Store !");
			System.out.println("1. Display Stock: ");
			System.out.println("2. Buy Item by item code: ");
			System.out.println("3. Generate Bill: ");
			System.out.println("4. Exit!");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				displayStock();
				break;
			case 2:
				buyItem(sc);
				break;
			case 3:
				generateBill(sc);
				break;
			case 4:
				System.out.println("Thanks for shopping!");
				break;
			}
		}while(choice!=4);
	}
}
