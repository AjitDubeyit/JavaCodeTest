package com.example.coadingtest.string;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		String str = "amazon";
		boolean unique = true;
		char ch;
		for(int i = 0; i<str.length(); i++) {
			unique = true;
			ch = str.charAt(i);
			for(int j = 0; j<str.length(); j++) {
				
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					unique = false;
					break;
				}
				
			}
			if(unique) {
				System.out.println("Non repeating unique character is: " +ch);
				break;
			}
		}
		
		
		
	}
}
