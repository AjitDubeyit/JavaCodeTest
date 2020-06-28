package com.test.core.CoreJava.concurrent.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class InterviewService {

	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(8);
		InterviewScheduler producer = new InterviewScheduler(queue);
		InterviewProcessor consumer = new InterviewProcessor(queue);
		new Thread(consumer).start();
		new Thread(producer).start();
		
	}
}
