package com.test.multithreading.producerConsumer;
import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		Buffer buffer = new Buffer(2);
		
		Thread p = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					buffer.produce();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		
		Thread c = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					buffer.consumer();
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		p.start();
		c.start();
	}
	
	static class Buffer{
		Queue<Integer> list;
		int threasholdSize;
		
		public Buffer(int threasholdSize) {
			this.threasholdSize = threasholdSize;
			list = new LinkedList<Integer>();
		}
		
		public void produce() throws InterruptedException{
			int value = 0;
			while(true) {
				synchronized (this) {
					while(list.size()>=threasholdSize) {
						//Wait for consumer to consume
						wait();
					}
					
					list.add(value);
					System.out.println("Produced: " + value);
					value++;
					notify();
					
					Thread.sleep(1000);
				}
			}
		}
		
		public void consumer() throws InterruptedException{
			while(true) {
				synchronized (this) {
					while(list.size()==0) {
						//wait for producer to produce
						wait();
					}
					int value = list.poll();
					System.out.println("Consume: " + value);
					//notify producer to produce
					notify();
					Thread.sleep(1000);
				}
			}
		}
	}
}
