package com.test.core.CoreJava.exception;

public class ExceptionTest {
	
	public static void main(String[] args) {
	
		try {
			throw new NullPointerException();
			
		}catch(Throwable e) {
			e.printStackTrace();
		}
	}
	
	
}
