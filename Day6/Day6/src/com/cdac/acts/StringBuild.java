package com.cdac.acts;
import java.lang.String;
public class StringBuild {

	public StringBuild() {
	}

	public static void main(String[] args) {

			String str1 = "ACTS IS a gaad college";
			System.out.println(str1);
			String str2 = new String("DAC");
			String str2of1 = new String("dAc");
			
			//equals ignore case
			System.out.println("ignoring case compare");
			System.out.println(str2.equalsIgnoreCase(str2of1));
			
			System.out.println(str2);
			char[] data = {'a','b','c'};
			String str3 = new String(data);
			System.out.println(str3);
			String c = "abc".substring(1,3);
			System.out.println(c);
			//concat
			System.out.println("print with concat");
			String str4 = str3.concat("d");
			System.out.println("Added d to str3");
			System.out.println(str4);
			//replace
			System.out.println("replaceing a with o");
			System.out.println(str1.replace('a', 'o'));
			System.out.println(str1);
			//length
			System.out.println("length of str1: " + str1.length());
			//intern
			System.out.println("intern()");
			System.out.println(str3.intern());
			//contains
			System.out.println("using contains");
			System.out.println(str1.contains("good"));
			//charAt()
			System.out.println("Char Index");
			System.out.println(str1.charAt(3));
			//compareTo
		    System.out.println("Compare to ");
			String str5 = new String("Ronak");
			String str6 = new String("Ronak");
			System.out.println(str6.compareTo(str5));
			
			//
			System.out.println("ToUpper");
			System.out.println(str2of1.toUpperCase());
			//Trim
			System.out.println("Trim");
			System.out.println("        Cdac is        very     go   od       for    pranay     tane     jaaaaaaaaaaaaaaaaaa    ".trim());
	}
}
