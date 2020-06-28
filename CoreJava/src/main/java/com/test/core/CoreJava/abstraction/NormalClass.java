package com.test.core.CoreJava.abstraction;

public class NormalClass extends AbstractClass{

	public NormalClass(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AbstractClass ac = new NormalClass(5);
	}
	
}
