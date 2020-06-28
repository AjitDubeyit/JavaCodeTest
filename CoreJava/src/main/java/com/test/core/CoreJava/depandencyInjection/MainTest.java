package com.test.core.CoreJava.depandencyInjection;

public class MainTest {
	
	public static void main(String[] args) {
		Shape triangle = new Triangle();
		Shape circle = new Circle();
		Drawing drawing = new Drawing();
		drawing.setShape(circle);
		drawing.drawShape();
	}

}
