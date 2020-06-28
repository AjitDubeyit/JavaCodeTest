package com.ds.test.demo.DataStructureTest.commonPrograms;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int num = 0;
		int reverseNumber = 0;
		
		System.out.println("Input your number and press enter");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		while(num != 0) {
			reverseNumber = reverseNumber*10;
			reverseNumber = reverseNumber+num%10;
			num = num/10;
		}
		System.out.println("Reverse input number is: " +reverseNumber);
	}

}
