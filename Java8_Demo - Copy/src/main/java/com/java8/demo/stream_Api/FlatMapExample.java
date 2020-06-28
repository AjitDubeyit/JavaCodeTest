package com.java8.demo.stream_Api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*This example show distinct output of string*/
public class FlatMapExample {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("JavaDevJournal","Java");
		List<String[]> word = words.stream().map(s->s.split(""))
				.distinct()
				.collect(Collectors.toList());
		
		for(String[] s:word) {
			for(String a:s) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		//Flat map
		System.out.println("Flat Map example \n");
		List<String> word1 = words.stream().map(s->s.split(""))
				.flatMap(Arrays::stream)
				.distinct()
				.collect(Collectors.toList());
		
		for(String s:word1) {
			System.out.print(s);
		}
	}
}
/* OUTPUT

JavaDevJournal
Java

Flat Map example 

JavDeournl
*/