package com.test.multithreading.executorsAPI;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.test.multithreading.common.LoopTaskA;

public class UsingSingleThreadExecutor {
	public static void main(String[] args) {
		System.out.println("main thread start here ....");
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		executorService.execute(new LoopTaskA()); 
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		
		executorService.shutdown();
		//executorService.execute(new LoopTaskA());//java.util.concurrent.RejectedExecutionException
		System.out.println("main thread end here ....");
		
	}

}
