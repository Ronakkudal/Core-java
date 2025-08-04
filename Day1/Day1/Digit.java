/*4. Get 4-digit number from user, write a function to calculate sum of digits
of the 4-digit number: Using loop and Using recursion */

import java.util.Scanner;

public class Digit{
	
	// Using Loop
	public static int calculateSumUsingLoop(int digit){
		
		int sum = 0;
		while(digit != 0){
			sum = digit%10 + sum;
			digit = digit/10;
		}
		System.out.print("The sum of digits is using loop:"); 
		return sum;
	}
	
	public static int calculateSumUsingRecursion(int digit){
		if(digit == 0){
			return 0;
		}
		return digit%10 + calculateSumUsingRecursion(digit/10);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 4 digit value");
		int digit = sc.nextInt();
		
		int ans = calculateSumUsingLoop(digit);
		System.out.println(ans);
		
		int res = calculateSumUsingRecursion(digit);
		System.out.print("The sum of digits is using recursion :" + res);
	}
}