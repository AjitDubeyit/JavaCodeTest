package com.test.multithreading.OddEvenThread;

public class ThreeOrMoreThreadConditional implements Runnable{

	public int maxNumber = 10;
	static int number = 1;
	int remainder;
	static Object lock = new Object(); 
	
	public ThreeOrMoreThreadConditional(int remainder) {
		this.remainder = remainder; 
	}
	
	@Override
	public void run() {
		while(number<maxNumber) {
			synchronized (lock) {
				while(number%2==remainder) {
					try {
						lock.wait();
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
		}
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreeOrMoreThreadConditional(0));
		Thread t2 = new Thread(new ThreeOrMoreThreadConditional(1));
		t1.start();
		t2.start();
	}
}
