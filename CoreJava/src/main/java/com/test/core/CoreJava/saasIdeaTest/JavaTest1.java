package com.test.core.CoreJava.saasIdeaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class JavaTest1 {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		int i = 10;
		li.add(i);
		int j = li.get(0);
		System.out.println(j);
		
		Map<String, List<Integer>> x = new TreeMap<>();
		System.out.println(x.get("abc"));
		x.keySet();
		
	}
}
