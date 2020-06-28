package com.test.core.CoreJava.clonableInterface.deepCopy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee_Main_DeepCopy {

	public static void main(String[] args) {
		
		System.out.println("Old Object!");
		Address address = new Address(11, "Boisar", "Yashwant", "Palghar", 401501);
		Employee e = new Employee(10, "Ajit", 29, "ajitdubey.it@gmail.com", "password", address, getDob("26/02/1991"));
		System.out.println(e);
		
		System.out.println("New object!");
		//e.getAddress().setCity("Mumbai");
		e.setName("Suresh");
		System.out.println(e);
	}
	
	private static Date getDob(String dob){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return sdf.parse(dob);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
