package com.test.core.CoreJava.immutable;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class EmployeeMain {

	public static void main(String[] args) {
		
		List<String> skill = new ArrayList<String>();
		skill.add("Java");
		skill.add("Python");
		skill.add("SQL");
		
		Address add = new Address();
		add.setAddressLine1("add1");
		add.setAddressLine2("add2");
		add.setCity("Mumbai");
		
		Address add1 = new Address();
		add1.setAddressLine1("add1");
		add1.setAddressLine2("add2");
		add1.setCity("Delhi");
		
		Address add2 = new Address();
		add.setAddressLine1("add1");
		add.setAddressLine2("add2");
		add.setCity("Chennai");
		
		
		Employee e = new Employee(1, "Ajit", new BigDecimal(100000), getDob("26/02/1991"),add,skill);
		Employee e1 = new Employee(2, "Amit", new BigDecimal(30000), getDob("26/03/1992"),add1,skill);
		Employee e2 = new Employee(3, "Kushal", new BigDecimal(30000), getDob("26/03/1992"),add2,skill);
		Employee e3 = new Employee(4, "Gauri", new BigDecimal(30000), getDob("26/03/1992"),add,skill);
		
		ConcurrentHashMap<Employee, String> conMap = new ConcurrentHashMap<Employee, String>();
		conMap.put(e, "Ajit");
		conMap.put(e1, "Amit");
		conMap.put(e2, "Kushal");
		conMap.put(e3, "Gauri");
		
		Set<Entry<Employee, String>> set = conMap.entrySet();
		for(Entry<Employee, String> entry : set) {
			Employee e4 = entry.getKey();
			String str = entry.getValue();
			System.out.println("Key: " + e4 + " Value: " + str);
		}
		System.out.println("--------------------------------------");
		System.out.println(e);
		e.getDob().setTime(1238560L);
		e.getSkills().add(".NET");
		System.out.println(e);
		System.out.println(conMap.get(e));	
	}
	
	private static Date getDob(String dob){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return sdf.parse(dob);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
