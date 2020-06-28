package com.ds.test.demo.DataStructureTest.recursive;

public class Factorial {

	private static int fact(int n) {
	
		int output;
		if(n==1) {
			return 1;
		}
		
		output = fact(n-1)*n;
		
		return output;
	}
	
	public static void main(String[] args) {
		
		int output = Factorial.fact(4);
		System.out.println(output);
		
	}
}
