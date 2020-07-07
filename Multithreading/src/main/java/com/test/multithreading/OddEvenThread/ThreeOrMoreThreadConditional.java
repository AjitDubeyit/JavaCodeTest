package com.test.multithreading.OddEvenThread;



public class ThreeOrMoreThreadConditional implements Runnable{

	public int PRINT_NUMBER_UPTO=10;
	static int number = 1;
	int remainder;
	static Object lock = new Object();

	ThreeOrMoreThreadConditional(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {
		while(number<PRINT_NUMBER_UPTO) {
			synchronized (lock) {
				while(number%4 != remainder) {//wait for number other than remainder
					try {
						lock.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() +" " + number);
				number++;
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				lock.notifyAll();
			}
		}
	}

	public static void main(String[] args) {
		ThreeOrMoreThreadConditional runnable1 = new ThreeOrMoreThreadConditional(1);
		ThreeOrMoreThreadConditional runnable2 = new ThreeOrMoreThreadConditional(2);
		ThreeOrMoreThreadConditional runnable3 = new ThreeOrMoreThreadConditional(3);
		ThreeOrMoreThreadConditional runnable4 = new ThreeOrMoreThreadConditional(0);

		Thread t1 = new Thread(runnable1,"Thread1");
		Thread t2 = new Thread(runnable2,"Thread2");
		Thread t3 = new Thread(runnable3,"Thread3");
		Thread t4 = new Thread(runnable4,"Thread4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}


}