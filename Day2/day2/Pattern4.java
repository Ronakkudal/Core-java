/*Write a java program for printing patterns like below

*****
***
*
***
*****

*/

package org.acts.day2;
public class Pattern4{
	public static void main(String[] args){
		int n=3;
		for(int i=0;i<n;i++){
			for(int j =2*(n-i)-1;j>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++){
			for(int j =0;j<2*(i)+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		
	}
	
}