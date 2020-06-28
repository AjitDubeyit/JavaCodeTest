package com.test.collection.Collection.concurrentHashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<Integer, String>();
		concurrentHashMap.put(100,"Ajit");
		concurrentHashMap.put(101,"Ajit1");
		concurrentHashMap.put(102,"Ajit2");
		concurrentHashMap.put(103,"Ajit3");
		concurrentHashMap.put(104,"Ajit4");
		
		concurrentHashMap.putIfAbsent(101, "Test");
		concurrentHashMap.remove(101);
		concurrentHashMap.putIfAbsent(105,"Ajit5");
		concurrentHashMap.replace(104, "Ajit4", "AjitFour");
		
		concurrentHashMap.forEach((k,v) -> System.out.println("Key: " + k + " Value: "+v));
		
	}
}
