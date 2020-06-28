package com.java8.demo.stream_Api;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SequentialParallelComparison {

	public static void main(String[] args) {
		String []strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		System.out.println("-------\nRunning sequential\n-------");
		run(Arrays.stream(strings).sequential());
		System.out.println("-------\nRunning parallel\n-------");
		run(Arrays.stream(strings).parallel());
	}
	
	private static void run(Stream<String> stream) {
		stream.forEach(s->{
			System.out.println(LocalTime.now() + " - value: " + s + " - thread " + Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
	}
}

/*Output explanation
 * 
 * This clearly shows that in sequential stream, each iteration waits for currently running one to finish, whereas, 
 * in parallel stream, eight threads are spawn simultaneously, remaining two, wait for others. Also notice the name of threads. 
 * In parallel stream, Fork and Join framework is used in the background to create multiple threads. Parallel streams create 
 * ForkJoinPool instance via static ForkJoinPool.commonPool() method.
 * */
