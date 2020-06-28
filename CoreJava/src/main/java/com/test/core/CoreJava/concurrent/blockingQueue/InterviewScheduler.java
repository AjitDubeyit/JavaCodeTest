package com.test.core.CoreJava.concurrent.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class InterviewScheduler implements Runnable {

	private BlockingQueue<String> queue;
	
	public InterviewScheduler(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		System.out.println("10 candidates have arrived");
		for(int i = 1; i<=100; i++) {
			String msg = new String("Candidate "+i);
			try {
				queue.put(msg);
				System.out.println("Interview scheduled for "+msg);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("intervew scheduled for all candidates");
		String msg = new String("stop");
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
