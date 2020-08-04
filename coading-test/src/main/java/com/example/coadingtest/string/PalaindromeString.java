package com.example.coadingtest.string;

public class PalaindromeString {
	
	public static boolean palindromeCheck(String s) {
		int i=0, j = s.length()-1;
		
		while(i<j){
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		palindromeCheck("nithin");
	}
	
	

}