package com.java8.demo.Java8_Demo.functional_programing;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class FP01Functional {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		//printAllNumbersInListStructured(numbers);
		//printEvenNumbersInListFunction(numbers);
		//printOddNumbersInListFunction(numbers);
		
		List<String> courses = Arrays.asList("Spring","Spring boot","API","Microservices","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		//printAllcoursesIndividually(courses);
		//printcoursescontainSpring(courses);
		//printcoursenameAtLeast4Letter(courses);
		printSquareOfEvenNumbers(numbers);
	}
	
	private static void print(int number) {
		System.out.println(number);
	}
	
	private static boolean isEven(int number) {
		return number%2==0;
	}
	
	private static boolean isOdd(int number) {
		return number%2!=0;
	}
	
	private static void printAllNumbersInListFunction(List<Integer> numbers) {
		//numbers.stream().forEach(FP01Functional::print);//method reference
		numbers.stream().forEach(System.out::println);
	}
	//Stream is a sequence of element
	private static void printEvenNumbersInListFunction(List<Integer> numbers) {
		//numbers.stream().filter(FP01Functional::isEven).forEach(FP01Functional::print);//method reference
		//numbers.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
		//List<Integer> even = numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
		//even.forEach(x->System.out.println(x));
		numbers.stream().filter(x->x%2==0).forEach(System.out::println);//method reference
	}
	
	private static void printSquareOfEvenNumbers(List<Integer> numbers) {
		numbers.stream().filter(x->x%2==0).map(x->x*x).forEach(System.out::println);
		
	}
	
	private static void printOddNumbersInListFunction(List<Integer> numbers) {
		//List<Integer> number = numbers.stream().filter(x->x%2!=0).collect(Collectors.toList());
		//number.forEach(x->System.out.println(x));
		//numbers.stream().filter(FP01Functional::isOdd).forEach(FP01Functional::print);
		numbers.stream().filter(FP01Functional::isOdd).forEach(System.out::println);
	}
	
	private static void printAllcoursesIndividually(List<String> course) {
		course.stream().forEach(x->System.out.println(x));	
	}
	
	private static void printcoursescontainSpring(List<String> course) {
		course.stream().filter(x->x.contains("Spring")).forEach(x->System.out.println(x));
	}
	
	private static void printcoursenameAtLeast4Letter(List<String> course) {
		course.stream().filter(x->x.length()>=4).forEach(System.out::println);
	}
}
