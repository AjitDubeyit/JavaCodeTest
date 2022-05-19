package com.java8.demo.Java8_Demo.functional_programing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PF01Excervises {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = Arrays.asList("Spring","Spring boot","API","Microservices","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		//printCubeOfOddNumbers(numbers);
		printNoOfCharInEachCourse(courses);
	}
	
	private static void printCube(int x) {
		System.out.println(x*x*x);
	}
	
	private static void printCubeOfOddNumbers(List<Integer> numbers) {
		
		//numbers.stream().filter(x->x%2==1).map(x->x*x*x).forEach(System.out::println);
		List<Integer> oddCube = numbers.stream().filter(x->x%2==1).map(x->x*x*x).collect(Collectors.toList());
		oddCube.forEach(System.out::println);
	}
	//Lambda Simplyfied representation of method
	private static void printNoOfCharInEachCourse(List<String> courses) {
		//courses.stream().forEach(x->System.out.println(x.length()));
		courses.stream().map(x->x.length()).forEach(System.out::println);
	}
	
}
