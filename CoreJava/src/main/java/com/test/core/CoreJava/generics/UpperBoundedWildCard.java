package com.test.core.CoreJava.generics;

import java.util.List;

public class UpperBoundedWildCard {
	//Upper bound helps to implement common logic we can pass here any type of value that is child of number i.e long, float, duble, integer
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for(Number num : numbers) {
			sum += num.doubleValue(); 
		}
		return sum;
	}
	
	public static void main(String[] args) {
		UpperBoundedWildCard ubg = new UpperBoundedWildCard();
		System.out.println(ubg.sumOfNumberList(List.of(1,2,5,6)));
		System.out.println(ubg.sumOfNumberList(List.of(1.0,2.3,5.6,6.9)));
		System.out.println(ubg.sumOfNumberList(List.of(1.0f,2.3f,5.6f,6.9f)));
		System.out.println(ubg.sumOfNumberList(List.of(1l,2l,5l,6l)));
	}

}
