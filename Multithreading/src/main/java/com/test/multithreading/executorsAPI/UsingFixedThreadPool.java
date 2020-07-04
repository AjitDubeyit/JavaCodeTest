package com.test.multithreading.executorsAPI;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.test.multithreading.common.LoopTaskA;

public class UsingFixedThreadPool {
	
	public static void main(String[] args) {
		System.out.println("main thread start here ....");
		ExecutorService executorService = Executors.newFixedThreadPool(6);
		executorService.execute(new LoopTaskA()); 
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA()); 
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		
		executorService.shutdown();
		executorService.execute(new LoopTaskA());
		System.out.println("main thread end here ....");
		
	}
	private void Sysout() {
		// TODO Auto-generated method stub

	}
}
