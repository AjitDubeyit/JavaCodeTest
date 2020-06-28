package com.java8.demo.zenpactTest;

class A{
	public void methodA() {
		System.out.println("MethodA");
	}
}

class B extends A{
	
	public void methodA() {
		System.out.println("MethodB");
	}
}

public class Test1 {
	
	public static void main(String[] args) {
		A a = new B();
		a.methodA();
	}
	
}
