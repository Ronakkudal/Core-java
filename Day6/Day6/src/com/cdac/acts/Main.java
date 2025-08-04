package com.cdac.acts;

public class Main {

	public static void main(String[] args) {
		// Create an Address object
		Add address1 = new Add("MG Road", 411001, 101);

		// Create an Employee object and associate it with the Address object
		Emp employee1 = new Emp(101, "Alice", address1);

		// Create another Address object
		Add address2 = new Add("FC Road", 411004, 205);

		// Create another Employee object and associate it with the second Address object
		Emp employee2 = new Emp(102, "Bob", address2);

		// Print the Employee objects to see the association
		System.out.println(employee1);
		System.out.println(employee2);
	}
}