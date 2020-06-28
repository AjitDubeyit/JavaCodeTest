package com.java8.demo.functional_Iinterface;

public interface InterfaceB {
	
	static void staticShow() {
		System.out.println("This is static method of interface B");
	}
	default void show() {
		System.out.println("This is default method of interface B");
	}

}
