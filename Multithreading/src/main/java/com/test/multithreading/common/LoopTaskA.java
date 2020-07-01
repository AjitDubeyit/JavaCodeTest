package com.test.multithreading.common;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Timeouts;

public class LoopTaskA implements Runnable {

	private static int count = 0;
	private int id;
	
	@Override
	public void run() {
		System.out.println("##### <TASK- "+id+"> STARTING #####");
		
		for(int i=10; i>0; i--) {
			System.out.println("<TASK- "+id+"> TICK TICK " + i);
			try {
				TimeUnit.MILLISECONDS.sleep((long)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("##### <TASK- "+id+"> DONE #####");
		
	}
	
	public LoopTaskA() {
		this.id = ++count;
	}

}
