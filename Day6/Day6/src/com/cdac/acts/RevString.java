package com.cdac.acts;

public class RevString {

		public static String revStr(String st) {
			int n=st.length();
			char ch[]= new char[n]; 
 			for(int i=0;i<n;i++) {
				ch[i]= st.charAt(n-i-1);
			}
 			String s = new String(ch);
 			return s;
		}
	public static void main(String[] args) {
		String str = " Reverse this palindrome";
	
		System.out.println(revStr(str));
	}

}
