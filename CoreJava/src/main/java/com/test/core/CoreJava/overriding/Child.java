package com.test.core.CoreJava.overriding;

import java.sql.SQLException;

public class Child extends Parent {
	
	public static void showMsg() throws RuntimeException {
		System.out.println("In side Child Class");
	}
}
