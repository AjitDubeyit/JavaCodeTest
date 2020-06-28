package com.test.core.CoreJava.error;

public class StackOverflowSample {

	public static void main(String[] args) {
		System.out.println("Before add in main method");
		add(2,3);
		System.out.println("After add in main method");
	}

	public static void add(int firstNumber, int secondNumber) {
		System.out.println("first line of add method!");
		add(firstNumber,secondNumber);
		System.out.println("Second line of add method!");
	}
}