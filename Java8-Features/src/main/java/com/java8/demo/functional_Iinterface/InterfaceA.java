package com.java8.demo.functional_Iinterface;

public interface InterfaceA {
	
	static void staticShow() {
		System.out.println("This is static method of Interface A");
	}
	default void show() {
		System.out.println("This is default method of Interface A");
	}

	
}
