package com.java8.demo.Java8_Demo.functional_programing;

import java.util.Arrays;
import java.util.List;

public class FP02Functional {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
	
//		0 12
//		12 9
//		21 13
//		34 4
//		38 6
//		44 2
//		46 4
//		50 12
//		62 15
//		77
		
		System.out.println(addList(numbers));
		
	}
	
	
	private static int sum(int aggrigate, int nextNumber) {
		System.out.println(aggrigate + " " + nextNumber);
		return aggrigate+nextNumber;
	}
	private static int addList(List<Integer> numbers) {
		return numbers.stream().reduce(0,FP02Functional::sum);
	}
	
	
}
