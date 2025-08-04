/* 5. Write a function for factorial and use the function for printing factorial
series like 1 2 6 24 120……… */

import java.util.Scanner;

public class Factorial{
	public static int fact(int n){
		if(n==1 || n==0){
			return 1;
		}
		else
		return n*fact(n-1);
		
	}
	
	public static void main(String[] args){
		System.out.println("Enter a number ");
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(fact(i) + "  ");
		}
		
	}
}