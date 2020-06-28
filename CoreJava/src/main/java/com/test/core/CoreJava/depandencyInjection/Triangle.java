package com.test.core.CoreJava.depandencyInjection;

public class Triangle implements Shape{

	@Override
	public void draw() {

		int w = 4;
		int h = 7;
		int areaOfTriangle = (1/2)*w*h;
		System.out.println("Area Of Triangle " + areaOfTriangle);
	}

}
