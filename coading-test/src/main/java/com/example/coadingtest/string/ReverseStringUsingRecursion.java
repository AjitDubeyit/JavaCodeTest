package com.example.coadingtest.string;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		String str = "Ajit";
		str = reverseString(str);
		System.out.println("Reversed string: " + str);
		
	}
	
	private static String reverseString(String str) {
		if(str.isEmpty()) {
			return str;
		} else {
			String s1 = str.substring(1);
			char s2 = str.charAt(0);
			return reverseString(s1)+s2;
		}
		
	}
}
