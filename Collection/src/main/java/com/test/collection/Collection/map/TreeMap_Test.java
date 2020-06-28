package com.test.collection.Collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Test {

	
	public static void main(String[] args) {
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(new Integer(90), "Ajit90");
		treeMap.put(new Integer(80), "Ajit80");
		treeMap.put(new Integer(70), "Ajit70");
		treeMap.put(new Integer(100), "Ajit100");
		treeMap.put(new Integer(10), "Ajit10");
		treeMap.forEach((k,v) -> System.out.println("Key: " + k + " Value: " + v));
		
	}
}
