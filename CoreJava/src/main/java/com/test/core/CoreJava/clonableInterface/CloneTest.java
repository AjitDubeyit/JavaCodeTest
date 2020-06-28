package com.test.core.CoreJava.clonableInterface;

public class CloneTest {

	public static void main(String[] args) {
		Employee e = new Employee(10, "Ajit", 29, "ajitdubey.it@gmail.com", "test");

		try {
			Object o = e.clone();
			Employee e1 = (Employee)o;
			System.out.println(e1);
			
		}catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
	}
}
