package com.example.coadingtest.synichron;

public class EffectiveFinalFeatureTest {

	public static void main(String[] args) {
		String name = "Test";
        Runnable r = () -> {
            System.out.println("name is : " + name);
        };
        Thread t = new Thread(r);
        t.start();
	}
}
