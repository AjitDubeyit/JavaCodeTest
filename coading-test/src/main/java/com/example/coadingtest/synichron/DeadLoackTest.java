package com.example.coadingtest.synichron;

public class DeadLoackTest {
	public static Object l1 = new Object();
	public static Object l2 = new Object();

	static class Thread1 extends Thread{
		@Override
		public void run() {

			synchronized (l1) {
				System.out.println(Thread.currentThread().getName()+" : holding lock on l1");

				try { 
					Thread.sleep(10); 
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+" : waiting for lock 2");

				synchronized (l2) {
					System.out.println(Thread.currentThread().getName()+" : holding lock 1 & 2");
				}
			}

		}
	}
	static class Thread2 extends Thread{

		@Override
		public void run() {
			synchronized (l2) {
				System.out.println(Thread.currentThread().getName()+" : holding lock on l2");

				try {	 
					Thread.sleep(10); 
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+" : waiting for lock 1");

				synchronized (l1) {
					System.out.println(Thread.currentThread().getName()+" : holding lock 1 & 2");
				}
			}
		}
	}

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		thread1.setName("Thread 1");
		thread2.setName("Thread 2");
		thread1.start();
		thread2.start();
	}
}
