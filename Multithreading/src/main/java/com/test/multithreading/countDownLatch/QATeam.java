package com.test.multithreading.countDownLatch;

public class QATeam extends Thread {

	public QATeam(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("Task assigned to QA Team " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task Finished by QA team " + Thread.currentThread().getName());
	}
	
	
}
