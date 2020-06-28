package com.ds.test.demo.DataStructureTest.recursive;

public class FibonacciSeriesWithoutRecursion {
	
	static int n = 10, t1 = 0, t2 = 1;
	public static void main(String[] args) {
		
		for(int i=1; i<=n; i++) {
			System.out.print(t1 + " + ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}
}
