package com.ds.test.demo.DataStructureTest;

import java.util.HashMap;
import java.util.Map;

public class MapQ {

	public static void main(String[] args) {
Map<WorkDay, String> map = new HashMap<WorkDay, String>();
WorkDay t1 = new WorkDay("Monday");
WorkDay t2 = new WorkDay("Monday");
WorkDay t3 = new WorkDay("Tuesday");

		map.put(t1, "Ajit");
		map.put(t2, "Ajit");
		map.put(t3, "Ajit");
		System.out.println(map.size());
		
	}
	
}


class WorkDay{
	String day;
	WorkDay(String day){
		this.day=day;
	}
	
	public boolean equals(Object o) {
		return ((WorkDay)o).day == this.day;
	}
}