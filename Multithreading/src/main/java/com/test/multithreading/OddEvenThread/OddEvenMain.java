package com.test.multithreading.OddEvenThread;

public class OddEvenMain {
	
	public static void main(String[] args) {
		
		OddEvenThreadPrinter print  = new OddEvenThreadPrinter();
		Thread odd = new Thread(new OddThread(print, 10),"Odd");
		Thread even = new Thread(new EvenThread(print, 10),"Even");
		odd.start();
		even.start();
		
		
	}

}
