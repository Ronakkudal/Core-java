package com.cdac.acts.bigpackage;
import java.time.LocalDate;
public class Person {
	private String name;
	private String addharNo;
	private LocalDate dob;
	private Address add;
	/**
	 * @param name
	 * @param addharNo
	 * @param dob
	 * @param add
	 */
	public Person(String name, String addharNo, LocalDate dob, Address add) {
		super();
		this.name = name;
		this.addharNo = addharNo;
		this.dob = dob;
		this.add = add;
	}
	
	public String getName() {
		return name;
	}

	public String getAddharNo() {
		return addharNo;
	}

	public LocalDate getDob() {
		return dob;
	}

	public Address getAdd() {
		return add;
	}

	@Override
	public String toString() {
		return "Person [" + (name != null ? "name=" + name + ", " : "")
				+ (addharNo != null ? "addharNo=" + addharNo + ", " : "") + (dob != null ? "dob=" + dob + ", " : "")
				+ (add != null ? "add=" + add : "") + "]";
	}
	
	
}
