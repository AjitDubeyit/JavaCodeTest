package com.java8.demo.methodReference;

public class StaticMethodReference2 {

	public static void threadStatus() {
		System.out.println("Thread is running.....");
	}
	
	public static void main(String[] args) {
		Thread t2 = new Thread(StaticMethodReference2::threadStatus);
		t2.start();
	}
}
