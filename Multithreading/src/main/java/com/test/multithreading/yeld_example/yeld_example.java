package com.test.multithreading.yeld_example;

public class yeld_example {

	public static void main(String[] args) {
		Thread c = new Consumer();
		Thread p = new Producer();
		
		p.setPriority(Thread.MIN_PRIORITY);
		c.setPriority(Thread.MAX_PRIORITY);
		
		
		p.start();
		c.start();
		
	}
}
