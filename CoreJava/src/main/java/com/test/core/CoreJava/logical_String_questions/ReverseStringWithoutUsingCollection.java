package com.test.core.CoreJava.logical_String_questions;

public class ReverseStringWithoutUsingCollection {
	
	public static void main(String[] args) {
		String s ="123ABC456xyz";
		char []str = s.toCharArray();
		for(int i=str.length-1; i>=0; i--) {
			System.out.print(str[i]);
		}
	}
}
