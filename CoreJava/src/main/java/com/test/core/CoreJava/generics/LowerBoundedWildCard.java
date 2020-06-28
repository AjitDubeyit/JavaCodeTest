package com.test.core.CoreJava.generics;

import java.util.ArrayList;
import java.util.List;
//Lower bound helps us to add sub type of number
public class LowerBoundedWildCard {

	static void addACoupleOfValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
	}
	
	public static void main(String[] args) {
		List emptyList = new ArrayList<Number>();
		addACoupleOfValues(emptyList);
		System.out.println(emptyList);
		
	}
}
