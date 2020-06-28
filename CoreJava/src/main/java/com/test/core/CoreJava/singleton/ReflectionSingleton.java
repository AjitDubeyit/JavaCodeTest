package com.test.core.CoreJava.singleton;

import java.lang.reflect.Constructor;

/*
 Here we can breaked the singleton pattern using reflection API
 * */
public class ReflectionSingleton {
	
	public static void main(String[] args) {
		
		Singleton objOne = Singleton.getInstance();
		Singleton objTwo = null;
		
		try {
			Constructor constructor = Singleton.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			objTwo = (Singleton) constructor.newInstance();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Instance 1 hashcode : " + objOne.hashCode());
		System.out.println("Instance 2 hashcode : " + objTwo.hashCode());
	}

}
