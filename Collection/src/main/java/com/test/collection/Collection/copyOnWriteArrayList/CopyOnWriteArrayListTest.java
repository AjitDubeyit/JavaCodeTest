package com.test.collection.Collection.copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

	public static void main(String[] args) {
		
		//List<Integer> list = new ArrayList<Integer>();
		List<Integer>  list = new CopyOnWriteArrayList<Integer>(); 
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer n = itr.next();
			System.out.println(n);
			if(n==5) {
				//itr.remove();
				list.remove(n);
				list.add(6);
			}
		}
		System.out.print(list);
	}
}
