package com.example.coadingtest.string;

public class PrintAllPermutationOfString {

	public static void main(String[] args) {
		String s = "ajit"; 
		printPermutation(s, "");
	}

	static void printPermutation(String str, String ans) {

		if (str.length() == 0) { 
			System.out.print(ans + " "); 
			return; 
		} 


		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			String str1 = str.substring(0,i);
			String str2 = str.substring(i+1);
			String ros = str1+str2;
			printPermutation(ros, ans+ch);
		}




	}
}
