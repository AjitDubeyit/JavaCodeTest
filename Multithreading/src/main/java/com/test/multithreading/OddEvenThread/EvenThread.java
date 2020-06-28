package com.test.multithreading.OddEvenThread;

public class EvenThread implements Runnable{
	OddEvenThreadPrinter print;
	int max;
	public EvenThread(OddEvenThreadPrinter print, int max) {
		this.print = print;
		this.max = max;
	}
	
	public void run() {
		for(int i = 2; i<=max; i+=2) {
			print.printEven(i);
		}
	}
}
