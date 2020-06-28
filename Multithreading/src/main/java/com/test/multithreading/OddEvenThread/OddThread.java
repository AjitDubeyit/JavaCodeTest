package com.test.multithreading.OddEvenThread;

public class OddThread implements Runnable {
	int max;
	OddEvenThreadPrinter print;
	public OddThread(OddEvenThreadPrinter print, int max) {
		this.print = print;
		this.max = max;
	}

	public void run() {
		for(int i = 1; i<=max; i+=2) {
			print.printOdd(i);
		}
	}
}
