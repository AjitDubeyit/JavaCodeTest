package com.test.core.CoreJava.exception;

public class UserDefinedCheckedException {
	
	public static void main(String[] args) {
		System.out.println("Starting of try block");
		
		try {
			MyException.showMsg();
		} catch(MyException e) {
			e.printStackTrace();
		}
		
		
		try {
			throw new MyException("my test class!");
		}catch(MyException e) {
			
		}
		
	}
	

}

class MyException extends Exception {
	
	public static void showMsg() throws MyException {
		System.out.println("Method Tested!");
	}
	String s1;
	
	public MyException(String s1) {
		this.s1 = s1;
	}
	
	public String toString() {
		return "my exception occoured " + s1;
	}
}
