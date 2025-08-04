package com.acts.cdac.arrayList.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.acts.cdac.arrayList.Account;
import com.acts.cdac.arrayList.AccountNotFoundException;
import com.acts.cdac.arrayList.AccountUtils;
import com.acts.cdac.arrayList.CurrentAccount;
import com.acts.cdac.arrayList.DataUtils;
import com.acts.cdac.arrayList.MinBalanceException;
import com.acts.cdac.arrayList.SavingAccount;
import com.acts.cdac.arrayList.accountType;

//1. Create simple List using CopyOnWriteArrayList of Account implement
//below menu
//Menus
//1 Accept A/C details from user
//2 Display all Accounts content using Enhanced For loop
//3 Accept account No &amp; display details or error message if account Not
//Found (Create AccountNotFoundException)
//4 Accept From A/C No, To Account No and amount for fund transfer.
//(check for min Bal Exception)
//
//5 Accept A/C NO &amp; remove A/C from List
//6 Apply interest on all saving A/C
//7 Sort accounts as per ascending A/C No.
//8 Sort by accountOpeningDate


public class BankSystem {


	public static void main(String[] args) {

		List<Account> accarr = new ArrayList<Account>();


		try (Scanner sc = new Scanner(System.in);){

			int choice = 0;
			do {
				System.out.println("1 Accept A/C details from user\n"
						+"2 Display all Accounts content using Enhanced For loop\n"
						+"3. Enter account number to be displayed"
						+"4. Funds Transfer");
				choice = sc.nextInt();
				switch(choice) {
				case 1:{ 
					userAdd(accarr ,sc);
					break;
				}
				case 2 : {
					//displayDetails(accarr);
					for( Account a : accarr) {
						System.out.println(a);
					}
					break;

				}
				case 3  : {
					long accno =sc.nextLong();
					 AccountUtils.findAccount(accno,accarr);
					// System.out.println(accarr.get(accno));
					
					break;}
				case  4 :  {
						System.out.println("Enter account no FROM which you need to transfer funds");
						long accno1 =sc.nextLong();
						AccountUtils.findAccount(accno1,accarr);
						
						System.out.println("Enter account no TO which you need to transfer funds");
						long accno2 =sc.nextLong();
						AccountUtils.findAccount(accno2,accarr);
						
						
					
					
					break;}
				default : System.out.println("sadfsa");
				}
			}while(choice!=6);
		} catch (AccountNotFoundException | MinBalanceException e) {
			e.printStackTrace();
		}

	}

	private static void userAdd( List<Account> list,Scanner sc ) {
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter balance:");
		long bal = sc.nextLong();
		System.out.println("Enter date of opening in format YYYY-MM-DD:");
		String strDate=sc.next();
		LocalDate date =  LocalDate.parse(strDate);  
		System.out.println("Enter acctype Saving or Current select 1 or 2:");

		System.out.println("Please enter the Account type");
		System.out.println("----please 1 for saving Account ---");
		System.out.println("----please 2 for Current Account ---");

		int type = sc.nextInt();


		switch(type) {
		case 1: list.add(new SavingAccount(name,bal,date ,accountType.SAVING));
		break;
		case 2 : list.add(new CurrentAccount(name,bal,date,accountType.CURRENT ));
		break;

		case 3 : System.out.println("exist");
		default : 
			System.out.println("Invaild choice");
		}


		//		         list.add(new Account(name , bal , date,));
		//		         System.out.println("------------Account created sucessfully ----------");

	}






}
