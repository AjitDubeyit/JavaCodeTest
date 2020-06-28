package com.test.multithreading.simphore;

public class Odd implements Runnable {
	private SharedPrinter sp;
	private int max;
	public Odd(SharedPrinter sp, int max) {
		this.sp = sp;
		this.max = max;
	}
	
	
	@Override
	public void run() {
		for(int i = 1; i<=max; i+=2) {
			sp.printOdd(i);
		}
	}
}
