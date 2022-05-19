package com.java8.demo.Java8_Demo.functional_programing;

import java.util.Arrays;
import java.util.List;

public class FP02Structured {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
		
		System.out.println(addList(numbers));
		
	}
	
	private static int addList(List<Integer> numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum = sum+number;
		}
		return sum;
	}
	
	
}
