package com.cdac.acts;
import java.lang.StringBuilder;
public class StrinBuilderTest {

	
		public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello Pranay 12 How Are You");
		// Append 
		System.out.println(sb.append("java"));
		
		//setCharAt()
		sb.setCharAt(0, 'l');
		System.out.println(sb);
		
		//subSequence
		
		System.out.println(sb.subSequence(6, 12));
		//LastIndexOf
		System.out.println(sb.lastIndexOf("You"));
		
		//reverse
		sb.reverse();
		System.out.println(sb);
		
		//trimtosize
		sb.trimToSize();
		System.out.println(sb);
		//capacity
		System.out.println(sb.capacity());
		//codePointCount
		System.out.println(sb.codePointCount(5, 20));
		
	}
	
}
