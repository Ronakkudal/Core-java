package com.cdac.acts.bigpackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentTester {
	
	public static String FORMAT ="dd-MM-yyyy";
	
	static LocalDate getDate(String date) {
		LocalDate localDate =LocalDate.parse(date);
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MMM/YYYY");
		String daT = localDate.format(dateFormat);
		LocalDate ld = LocalDate.parse(daT);
		return ld;
		}
	
	public static void main(String[] args) {
		 LocalDate date = LocalDate.now();
		 System.out.println(date);
		 Student[] sarr = new Student [5];
		 sarr[0]= new Student(CourseEnum.DAC,LocalDate.of(1984, 9, 11),"Pranay");
		 sarr[1]= new Student(CourseEnum.DAC,LocalDate.of(1984, 9, 12),"Praphul Sir");
		 sarr[2]= new Student(CourseEnum.DAC,LocalDate.of(1996, 12, 05),"Rahul");
		 sarr[3]= new Student(CourseEnum.DAC,LocalDate.of(1971, 1, 16),"Ronak");
		 sarr[4]= new Student(CourseEnum.DAC,LocalDate.of(1969, 12, 1),"RahulBD");
		 
		 for(int i=0;i<sarr.length - 1;i++) {
			 for(int j=0;j<sarr.length-i -1;j++) {
				 if(sarr[j].getDob().isBefore(sarr[j+1].getDob())) {
					 Student temp;
					 temp=sarr[j+1];
					 sarr[j+1]=sarr[j];
					 sarr[j]=temp;
					 }
			 }
		 }
		 for (Student s : sarr) {
			 System.out.println(s);
		 }
	}

}
