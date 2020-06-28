package com.example.coadingtest.synichron;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CuncurrentTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("45");
		list.add("60");
		list.add("70");
		list.add("90");
		list.add("10");

		for(String num: list){
			if(num.contains("70")){
				list.remove(num);
			}
		}

		System.out.println("Before : " + list);
		for(int i=0; i<list.size(); i++){
			String num = list.get(i);
			if(num.contains("70")){
				list.remove(num);
			}
		}
		System.out.println("After : " + list);
	}

}
