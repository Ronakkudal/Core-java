package com.cdac.acts.bigpackage;
import java.time.LocalDate;
public class Student {
	CourseEnum course;
	LocalDate dob;
	String name;
	
	
	public Student(CourseEnum course, LocalDate dob, String name) {
		super();
		this.course = course;
		this.dob = dob;
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	
	@Override
	public String toString() {
		return "Student [course=" + course + ", dob=" + dob + ", name=" + name + "]";
	}

	

}
