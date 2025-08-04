package com.cdac.acts.test;

import com.cdac.acts.Account;
import com.cdac.acts.DataUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		//Account[] arr =new Acccount[20];
		List <Account> list = new ArrayList<>();
		try(Scanner sc = new Scanner(System.in);){
			int choice=0;
			do {
				System.out.println("1.     Add account\r\n"
						+ "2.     Print all accounts\r\n"
						+ "3.     Sort by account no desc\r\n"
						+ "4.     Sort by accName\r\n"
						+ "5.     Sort by Date of opening\r\n"
						+ "6.     Sort by balance desc\r\n"
						+ "7.       exit\r\n"
						+ "");
				choice = sc.nextInt();
				switch(choice) {
					case 1 : list = DataUtils.getAccData(sc);
								break;
					case 2 : for(Account a : list) {
								System.out.println(a);
								}
								break;
					case 7 : break;
				}
				
			}while(choice!=7);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
