package com.test.core.CoreJava.overriding;

import java.sql.SQLException;
//Uncheck(Parent) to checked(Child) is not possible but vice versa is possible
// You can not 
public class Parent {
	
	public static void showMsg() throws SQLException {
		System.out.println("In side Parent Class");
	}

}
