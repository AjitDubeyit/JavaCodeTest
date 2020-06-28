package com.test.multithreading.simphore;

public class Even implements Runnable{

	private SharedPrinter sp;
	private int max;
	
	public Even(SharedPrinter sp, int max) {
		this.sp = sp;
		this.max = max;
	}
	
	@Override
	public void run() {
		for(int i=2; i<=max; i+=2) {
			sp.printEven(i);
		}
	}
}
