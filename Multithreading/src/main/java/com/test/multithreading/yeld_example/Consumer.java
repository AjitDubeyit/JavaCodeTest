package com.test.multithreading.yeld_example;

public class Consumer extends Thread{

	@Override
	public void run() {
		for(int i = 0; i<=10; i++) {
			System.out.println("Consumer: " + i);
			Thread.yield();
		}
	}
}
