package com.test.multithreading.simphore;

public class EvenOddMain {

	public static void main(String[] args) {
		SharedPrinter sp = new SharedPrinter();
		Thread odd = new Thread(new Odd(sp,10));
		Thread even = new Thread(new Even(sp, 10));
		odd.start();
		even.start();
	}
}
