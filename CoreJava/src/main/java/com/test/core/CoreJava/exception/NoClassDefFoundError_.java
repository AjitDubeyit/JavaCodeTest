package com.test.core.CoreJava.exception;
//Class will be found at compile time but not at run time due to file corruption
class A {

}

public class NoClassDefFoundError_ {
	public static void main(String[] args) {
		A a = new A();	
	}
}

