package com.test.multithreading.callable;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class CallableExample implements Callable {

	@Override
	public Object call() throws Exception {
		Random random = new Random();
		Integer randomNumber = random.nextInt(5);
		Thread.sleep(randomNumber*100);
		return randomNumber;
	}
}
public class CallableFutureTest {

	public static void main(String[] args) throws Exception {
		FutureTask[] futureTask = new FutureTask[5];
		
		for(int i=0; i<5; i++) {
			Callable callable = new CallableExample();
			futureTask[i] = new FutureTask(callable);
			Thread t = new Thread(futureTask[i]);
			t.start();
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(futureTask[i].get());
		}
	}
}
