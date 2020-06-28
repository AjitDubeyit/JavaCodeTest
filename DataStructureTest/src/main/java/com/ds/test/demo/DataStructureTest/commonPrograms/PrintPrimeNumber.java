package com.ds.test.demo.DataStructureTest.commonPrograms;

public class PrintPrimeNumber {
	static int limit = 100;
	
	public static void main(String[] args) {
		String printNumber = "";
		for(int i = 1; i<limit; i++) {
			if(checkPrime(i)) {
				printNumber = printNumber+i+" ";
			}
		}
		System.out.println(printNumber);
		
	}
	
	public static boolean checkPrime(int number) {
		int reminder = 0;
		boolean isPrime = true;
		for(int i=2; i<number; i++) {
			reminder = number%i;
			if(reminder == 0) {
				isPrime = false;//not a prime number
				break;
			}
		}
		return isPrime;//prime number
	}
}
