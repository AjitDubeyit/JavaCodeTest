package com.java8.demo.optional;

import java.util.Optional;

public class Tester {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		 Tester t = new Tester();
		 Integer value1 = null;
		 Integer value2 = new Integer(10);
		 
		 Optional<Integer> a = Optional.ofNullable(value1);
		 Optional<Integer> b = Optional.of(value2);
		 
		 Integer sum  = t.sum(a, b);
		 System.out.println("Sum : " + sum);
	}
	
	@SuppressWarnings("deprecation")
	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		System.out.println("First parameter is present " + a.isPresent());
		System.out.println("Second parameter is present " + b.isPresent());
		
		//Optional.orElse returns value if present otherwise returns the default value passed
		Integer value1 = a.orElse(new Integer(0));
		//Optional.get - gets the value, value should be present
		Integer value2 = b.get();
		
		Integer value3 = b.orElse(0);
		System.out.println("Value 3: " + value3);
		return value1+value2;
	}
}
