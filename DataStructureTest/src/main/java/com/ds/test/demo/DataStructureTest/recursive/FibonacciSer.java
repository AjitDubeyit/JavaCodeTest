package com.ds.test.demo.DataStructureTest.recursive;

public class FibonacciSer {

	private static int fibonacci(int n) {
		
		if(n<1) {
			System.out.println("sfdsd");
		} else if(n==1 || n==2) {
			return n-1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int fibonacciSeries = FibonacciSer.fibonacci(10);
		System.out.println(fibonacciSeries);
	}
}
