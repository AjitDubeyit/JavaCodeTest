package com.example.coadingtest;


public class FindTwoSum {

	public static void main(String[] args) {
		System.out.println(findTwoSum(5,10));
		System.out.println(findTwoSum(5,0));
		System.out.println(findTwoSum(5,-5));
		System.out.println(findTwoSum(-5,10));
		System.out.println(findTwoSum(-10,-10));
		System.out.println(findTwoSum(-10,0));
		System.out.println(findTwoSum(0,10));
	}

	private static int findTwoSum(int j, int sum) {
		return sum-j;
	}
}
