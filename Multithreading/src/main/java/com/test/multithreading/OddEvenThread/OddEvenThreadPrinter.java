package com.test.multithreading.OddEvenThread;

public class OddEvenThreadPrinter {

	boolean isOddPrinted = false;
	
	synchronized void printOdd(int number) {
		while(isOddPrinted) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " " + number);
		isOddPrinted = true;
		notify();
	}
	
	synchronized void printEven(int number) {
		while(!isOddPrinted) {
			try {
				wait();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " " + number);
		isOddPrinted = false;
		notify();
	}
}
