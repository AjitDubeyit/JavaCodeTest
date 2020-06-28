package com.test.core.CoreJava.overriding;

import java.sql.SQLException;

public class Child1 extends Parent1 {

	public void showMsg() throws SQLException {
		System.out.println("In side Child Class");
	}
}
