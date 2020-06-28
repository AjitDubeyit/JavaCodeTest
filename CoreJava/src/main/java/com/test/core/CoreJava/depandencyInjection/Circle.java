package com.test.core.CoreJava.depandencyInjection;

public class Circle implements Shape{

	@Override
	public void draw() {
		float pi = 3.14f;
		int r = 6;
		System.out.println("Area of circle: " + pi*r*r);
		
	}

}
