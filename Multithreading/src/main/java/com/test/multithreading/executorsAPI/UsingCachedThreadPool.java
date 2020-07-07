package com.test.multithreading.executorsAPI;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.test.multithreading.common.LoopTaskA;

public class UsingCachedThreadPool {

	
	public static void main(String[] args) {
		System.out.println("main thread start here ....");
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(new LoopTaskA()); 
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA()); 
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		
		
		Future<ExecutorService> dfds = (Future<ExecutorService>) executorService.submit(new LoopTaskA());//java.util.concurrent.RejectedExecutionException
		System.out.println("isDone: "+dfds.isDone() + " isCancelled(): " + dfds.isCancelled());
	
		executorService.shutdown();
		System.out.println("isDone: "+dfds.isDone() + " isCancelled(): " + dfds.isCancelled());
		System.out.println("main thread end here ....");
		
	}
}
