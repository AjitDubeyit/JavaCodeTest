package com.java8.demo.stream_Api;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Test2 {
	//Find 3 distinct smallest numbers from an array of int
	
	//StreamAPI = create + process + consume
	public static void main(String[] args) {
		int []number = {4,1,13,90,16,2,0};
		
		int []copy = Arrays.copyOf(number, number.length);
		Arrays.sort(copy);
		
		for(int i = 0; i<3; i++) {
			System.out.println(copy[i]);
		}
		//Java8
		//Original array is not mutated!
		IntStream.of(number).
		distinct().sorted().limit(3).forEach(x->System.out.print(x));
		
		int sum = IntStream.of(number).distinct().sorted().limit(3).sum();
		System.out.println("Sum of three smallest number: " + sum);
		
		OptionalDouble average = IntStream.of(number).distinct().limit(3).average();
		System.out.println("Average: " + average);
		
		int count = (int) IntStream.of(number).distinct().limit(3).count();
		System.out.println("count:" + count);
		
		int min = IntStream.of(number).distinct().limit(3).min().getAsInt();
		System.out.println("min : " + min);
		
		int max = IntStream.of(number).distinct().limit(3).max().getAsInt();
		System.out.println("Max : " + max);
	}

}
