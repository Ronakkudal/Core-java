package org.acts.day3;
import java.util.Scanner;

public class Emp{
	private long empno;
	private String ename;
	private double sal;
	private static long baseEmpno = 10000000;
	
	public Emp(){
		System.out.println("\n Employee() DEFAULT CTOR"); 
		this.empno = ++baseEmpno;
		this.ename="";
		this.sal=25000.00;
		
	}
	public Emp(String name,double salary){
		System.out.println("\n Employee(String,double) Para ctor"); 
		this.empno = baseEmpno++;
		this.ename= name;
		this.sal=salary;
	}
	
	public void printData() {
		System.out.println("Employee ["
		+ "EMPNO="+empno
		+"\tName="+ename
		+"\tSalary="+sal
		+"]"); 
	}
	
}	