package com.test.core.CoreJava.depandencyInjection;

public class Drawing {

	private Shape shape;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void drawShape() {
		this.shape.draw();
	}
	
	
}
