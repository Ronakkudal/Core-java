/*Write a java program for printing patterns like below

*******
*** ***
**   **
*     *

*/

package org.acts.day2;
public class Pattern3{
	public static void main(String[] args){
		
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j =n-i+1;j>0;j--){
				System.out.print("*");
			}
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int j =1;j<i;j++){
				System.out.print(" ");
			}
			
			for(int j =n-i+1;j>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}