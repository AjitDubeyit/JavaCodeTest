package com.test.multithreading.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class DEVTeam extends Thread{
	
	private CountDownLatch countDownLatch;
	
	public DEVTeam(CountDownLatch countDownLatch, String name) {
		super(name);
		this.countDownLatch = countDownLatch;
	}
	
	public void run() {
		System.out.println("Task asssigned to development team " + Thread.currentThread().getName());
		try{
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task finished by development team "+Thread.currentThread().getName());
		
		//Each thread calls countDown() method on task completion
		countDownLatch.countDown();//It will count down by decrement 1
	}
	
}
