package com.test.multithreading.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;

public class PassengerThread extends Thread {
	private int duration;
	private CyclicBarrier barrier;

	public PassengerThread( int duration, CyclicBarrier barrier, String pname) {
		super(pname);
		this.duration = duration;
		this.barrier = barrier;
	}

	public void run() {
		try {
			Thread.sleep(duration);
			System.out.println(Thread.currentThread() + " is arrived");
			int await = barrier.await();
			if (await == 0) {
				System.out.println("4 passangers have arrived");
			}
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

}
