package com.test.multithreading.yeld_example;

public class Producer extends Thread {

	@Override
	public void run() {
		for(int i = 0; i<=10; i++) {
			System.out.println("Produce: " +i);
			Thread.yield();
		}
	}
}
