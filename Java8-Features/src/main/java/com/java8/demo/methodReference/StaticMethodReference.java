package com.java8.demo.methodReference;

interface Sayable{
	void say();
}

public class StaticMethodReference {

	public static void saySomething() {
		System.out.println("Hello This is static method!");
	}
	
	public static void main(String[] args) {
		
		Sayable say = StaticMethodReference::saySomething;
		
		say.say();
		
	}
}
