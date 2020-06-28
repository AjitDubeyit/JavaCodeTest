package com.test.core.CoreJava.interfaces;

public class Child implements Base1, Base2{

	
	
	
	
	
	public static void main(String[] args) {
		Base1 b1 = new Child();
		Base2 b2 = new Child();
		b1.show();
		b2.show();
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		Base1.super.show();
	}
}
