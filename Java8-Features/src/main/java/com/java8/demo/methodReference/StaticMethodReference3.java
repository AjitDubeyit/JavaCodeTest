package com.java8.demo.methodReference;

import java.util.function.BiFunction;

class Arithmatic{
	public static int add(int a, int b) {
		return a+b;
	}
}
public class StaticMethodReference3 {
	
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = Arithmatic::add;
		int result = adder.apply(10, 20);
		System.out.println("Addition is: "+result);
	}

}
