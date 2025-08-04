package org.acts.day3;
import java.util.Scanner;
import org.acts.day3.Emp;

public class EmployeeTester{
	public static void main(String []args){
		Scanner msc=new Scanner(System.in);
		Emp []earr;
		earr= new Emp[5];
		for(int i=0;i<5;i++){
		System.out.println("Enter name and salary");
		String name = msc.next();
		double sal = msc.nextDouble();
		msc.nextLine();
		earr[i] = new Emp(name,sal);
		earr[i].printData();
		}
		msc.close();
	}
}