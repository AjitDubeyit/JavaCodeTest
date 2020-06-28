package com.test.core.CoreJava.overloading;

public class OverloadingTest {

	public void m1(Object o) {
		System.out.println("Inside m1 Object!");
	}
	
	public void m1(Number o) {
		System.out.println("Inside m1 Number!");
	}
	
	public void m1(Integer i) {
		System.out.println("Inside m1 Integer!");
	}
	
	public void m1(Double d) {
		System.out.println("Inside m1 double!");
	}
	
	public static void main(String[] args) {
		OverloadingTest t = new OverloadingTest();
		t.m1(5);
	}
}
