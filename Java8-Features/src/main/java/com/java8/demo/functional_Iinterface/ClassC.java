package com.java8.demo.functional_Iinterface;

public class ClassC implements InterfaceA,InterfaceB{

	public static void main(String[] args) {
		ClassC cl = new ClassC();
		cl.show();
		InterfaceA.staticShow();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		InterfaceB.super.show();
	}
}
