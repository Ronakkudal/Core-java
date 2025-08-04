package com.cdac.acts.bigpackage.Gratuity;

import java.time.LocalDate;

public class Employee {


	private	String name;
	private int id;
	private LocalDate dob;
	private LocalDate doj;
	private Dept dept;
	 

	
	
	public Employee(String name, int id, LocalDate dob, LocalDate doj,Dept dept) {
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.doj = doj;
		this.dept= dept;
	}
	
//	@Override
//	public String toString() {
//		return "Employee name=" + name + ", id=" + id + ", dob=" + dob + ", doj=" + doj;
//	}

	public LocalDate getDoj() {
		return doj;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", dob=" + dob + ", doj=" + doj + ", dept=" + dept + "]";
	}

}