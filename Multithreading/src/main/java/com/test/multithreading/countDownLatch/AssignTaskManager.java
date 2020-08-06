package com.test.multithreading.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class AssignTaskManager {
	
	public static void main(String[] args) throws InterruptedException{
		//Created countDownLatch for two threads
		CountDownLatch countDownLatch = new CountDownLatch(2);
		
		DEVTeam devTeamA = new DEVTeam(countDownLatch, "DEVTeamA");
		DEVTeam devTeamB = new DEVTeam(countDownLatch, "DEVTeamB");
		
		devTeamA.start();
		devTeamB.start();
		//is a blocking method untill unless two tasks are completed
		countDownLatch.await();
		
		QATeam qaTeam = new QATeam("QA Team");
		qaTeam.start();
		
		
	}

}
