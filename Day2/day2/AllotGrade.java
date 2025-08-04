/*Write a Java program to allot grade student grade based on below conditions
Up to 50% pass class
Up to 60% second class
Up to 75% First class
Above 75% Distinction
*/
package org.acts.day2;
import java.util.Scanner;

public class AllotGrade{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double ch = 0;
		while(ch!=-1){
			System.out.println("Enter % of student"
			+"\nEnter -1 to exit");
			ch = sc.nextDouble();
			if (ch<=50&&ch>=0){
			System.out.println("\tpass class");
			}
			else if(ch<=60 && ch >50){
			System.out.println("\tsecond class");
			}
			else if(ch<=75 && ch>60){
			System.out.println("\t First class");
			}
			else if(ch>75&&ch<=100){
			System.out.println("\t Distinction");
			}
			else{
			System.out.println("\t Incorrect % try again");
			}
		}
		sc.close();
	}
}