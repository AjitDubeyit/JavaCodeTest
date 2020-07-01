package com.test.multithreading.waysToCreateThread;

import java.util.concurrent.TimeUnit;

public class FirstWay {

	public static void main(String[] args) {
		
		new FirstTask();
		Thread t = new FirstTask();
		
		
	}
}

class FirstTask extends Thread{
	private static int count = 0;
	private int id;
	
	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println("Thread <"+id+">Tik tik "+i);
			try {
			TimeUnit.MILLISECONDS.sleep(200);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}
	
	public FirstTask() {
		this.id=++count;
		this.start();
	}
}
