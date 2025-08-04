package com.cdac.acts.account.tester;
import java.util.Scanner;
import com.cdac.acts.account.Account;
import com.cdac.acts.account.SavingAccount;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
//import java.time.LocalDate;

public class AccountTester extends Account{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		List<Account> Acclist=new ArrayList<>();
//		List<SavingAccount> Acclist2=new ArrayList<>();
		
		int ch;
		int end=0;
		do {
			System.out.println("****Menu ****\n"
					+ "1. Add Account \n"
					+ "2. Print all accounts \n"
					+ "3. Create unmodifiable from existing list \n"
					+ "4. Use Upper bound \n"
					+ "5. Use Lower bound \n"
					+ "6.exit");
			ch=sc.nextInt();
			switch (ch) {
			case 1:{
//				 String accName, LocalDate doo, double bal
				System.out.println("Enter your name");
				String name=sc.next();
				System.out.println("Enter amount to add in account");
				double Bal=sc.nextDouble();
				Account f= new Account(name,Bal);
				Acclist.add(f);
				break;}
			case 2:{
				Iterator<Account> iter = Acclist.iterator();
				while(iter.hasNext()) {
					System.out.println(iter.next());
				}
				break;
				}
			case 3:{
				List<Account> unmodiList = Collections.unmodifiableList(Acclist);
				System.out.println("You cant Modify unmodifiable List");
				
				Account f= new Account("Alic",456.00);
				unmodiList.add(f);
				
				break;
				}
			case 4:{
				List <? extends Account> upperList =Acclist;
				for(Account acc : upperList) {
					System.out.println(acc);
				}
				break;}
			case 5:{
				List <? super Account> lowerList =Acclist;
				lowerList.add(new Account("John", 1000));
				lowerList.add(new SavingAccount("Alice", 2000)); 
				System.out.println(lowerList.get(0));
				break;}
			case 6:{
				end=6;
				break;}
			default :{
				System.out.println("Invalid input");
				break;}
			}
		
		
		}while(end!=6);
		
		sc.close();
	}

}

