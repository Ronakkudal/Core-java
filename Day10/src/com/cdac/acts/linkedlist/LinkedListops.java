package com.cdac.acts.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListops {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	LinkedList<Integer> linklist1= new LinkedList<>();
int count=0;
do {
	Integer num=sc.nextInt();
	
	linklist1.add(num);
	count++;
}while(count<10);

for (Integer numm: linklist1) {
	System.out.println(numm);
}
int sum=0;
for (Integer num: linklist1) {
	sum+=num;
}
System.out.println("Sum of array is: "+sum);
Integer In=56;
System.out.println("Index of 56 is :"+linklist1.indexOf(In));
System.out.println("last index if 56 is "+linklist1.lastIndexOf(In));

//get
System.out.println("get at index 0 is "+linklist1.get(0));
System.out.println("get first index "+linklist1.getFirst());
System.out.println("get last index "+linklist1.getLast());
//remove
System.out.println("removed element at head "+linklist1.remove());
System.out.println("Removes the element at the 2 position in this list"+linklist1.remove(0));

//set at index
linklist1.add(0, 100); // Adding 100 at index 0
System.out.println("After setting 100 at index 0, elements in the LinkedList:");
for (Integer num : linklist1) {
    System.out.println(num);
}

sc.close();
}

}
