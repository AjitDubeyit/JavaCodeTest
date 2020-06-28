package com.java8.demo.stream_Api;

import java.util.ArrayList;
import java.util.List;

//Performance test between parallel stream and sequentioal stream
public class PerformanceTest {

	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<Integer>();
		List<Integer> list_two  = new ArrayList<Integer>();
		for(int i=0; i<1000000; i++) {
			list.add(i);
		}
		long startTime = System.currentTimeMillis();
		list.stream().forEach(num->list_two.add(num));
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken by stream: "+(endTime-startTime));
		
		list_two.clear();
		startTime = System.currentTimeMillis();
		list.parallelStream().forEach(num->list_two.add(num));
		endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken by ParallelStream: "+(endTime-startTime));
	}
}
