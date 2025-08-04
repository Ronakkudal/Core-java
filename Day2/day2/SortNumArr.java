package org.acts.day2;
import java.util.Scanner;
public class SortNumArr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements you want in your array:");
		int ele = sc.nextInt();
		int []arr = new int[ele];
		System.out.println("All elements");
		for(int i =0;i<ele;i++){
			
			//System.out.println("Enter "+i+"th element:");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<ele-1;i++){
			for(int j=0;j<ele-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i =0;i<ele;i++){
			
			System.out.println(" "+arr[i]);
			
		}
		sc.close();
	}
}
