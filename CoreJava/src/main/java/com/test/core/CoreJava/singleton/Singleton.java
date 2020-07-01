package com.test.core.CoreJava.singleton;

import java.io.Serializable;

public final class Singleton implements Serializable{

	private static volatile Singleton instance = null;
	
	private Singleton() {
		/*
		 * If we need to prevent to break singleton pattern by using reflection 
		 *  we should throw runtime exception
		 *  
		 * if(instance!=null) { throw new RuntimeException(); }
		 */
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println("Instance 1 hashcode : " + instance1.hashCode());
		System.out.println("Instance 2 hashcode : " + instance2.hashCode());
	}
}
