package com.cdac.acts.bigpackage;

import java.time.LocalDate;

public class PersonTester {

	public static void main(String[] args) {
		Person[] p = new Person[5];
		p[0] = new Person("Ronak","13214132543",LocalDate.of(1972, 2, 4), new Address("Rajaisthan", 611021, 1016));
		p[1] = new Person("Pranay","3464577457",LocalDate.of(1940, 2, 4), new Address("Delhi", 431021, 126));
		p[2] = new Person("udit","1321413453432543",LocalDate.of(1962, 2, 4), new Address("Pashan", 111021, 10));
		p[3] = new Person("Prem","45745734",LocalDate.of(1922, 2, 4), new Address("Uthrakhand", 711021, 6));
		p[4] = new Person("Raghav","345bgfghfd",LocalDate.of(1912, 2, 4), new Address("Mumbai", 411021, 16));
		
		//checking if born before and also age above 100
		LocalDate checkr = LocalDate.of(1947, 8, 15);
		LocalDate curdate = LocalDate.now();
		for(int i =0; i< p.length ; i++) {
			if(p[i].getDob().isBefore(checkr)) {
				System.out.println("Born before independance");
				System.out.println(p[i].toString());
			}
			int years =  curdate.getYear() - p[i].getDob().getYear();
			if ((curdate.getMonthValue() < p[i].getDob().getMonthValue()) ||
		            (curdate.getMonthValue() == p[i].getDob().getMonthValue() && 
		            		curdate.getDayOfMonth() < p[i].getDob().getDayOfMonth())) {
		            years--;
		        }
			System.out.println(p[i].toString() + " Ager is " + years);
			
			
			if(years>=100) {
				System.out.println("Age above 100 are below");
				System.out.println(p[i].toString());
			}
				
			
			
		}
		
	}

}
