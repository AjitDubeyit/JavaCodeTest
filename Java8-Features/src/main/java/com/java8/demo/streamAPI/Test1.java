package com.java8.demo.streamAPI;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Test1 {
	public static void main(String[] args) {
		int []number = {4,1,13,90,16,2};
		int min = number[0];
		for(int i=1; i<number.length;i++) {
			if(number[i]<min) {
				min = number[i];
			}
		}
		System.out.println("Min is [ " + min + " ]");
		
		//int minNum = IntStream.of(number).min().getAsInt();
		//IntStream.of(number).min().ifPresent(min1->System.out.println(min1));
		IntStream.of(number).min().ifPresent(System.out::println);
		
		int max = IntStream.of(number).max().getAsInt();
		OptionalDouble average = IntStream.of(number).average();
		//int count = IntStream.of(number).count();
		int sum = IntStream.of(number).sum();
		System.out.println("Max: " + max + " sum: " + sum + " average: " + average);
		
		IntSummaryStatistics statics = IntStream.of(number).summaryStatistics();
		System.out.println("Statics: " + statics);
	}
}
