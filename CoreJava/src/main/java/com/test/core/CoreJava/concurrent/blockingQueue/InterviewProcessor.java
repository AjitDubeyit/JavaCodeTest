package com.test.core.CoreJava.concurrent.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class InterviewProcessor implements Runnable {

	private BlockingQueue<String> queue;

	public InterviewProcessor(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			String msg;
			Thread.sleep(10000);//sleep for 10 second
			while(!(msg=queue.take()).equals("stop")) {
				System.out.println("Interview completed for " + msg);
				Thread.sleep(1000);
			}
			System.out.println("Interview completed for all condidates");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
