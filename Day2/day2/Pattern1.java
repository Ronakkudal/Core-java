/*Write a java program for printing patterns like below

*****
****
***
**
*
*/

package org.acts.day2;
public class Pattern1{
	public static void main(String[] args){
		int n=5;
		for(int i=0;i<n;i++){
			for(int j =n-i;j>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}