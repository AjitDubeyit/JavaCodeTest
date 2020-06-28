package com.hascode.test;

public class Test {

	public static void main(String[] args) {

		Employee e = new Employee();
		Employee e1 = new Employee();

		System.out.println(e);
		System.out.println(e1);
		
		if(e==e1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		

	}
}
