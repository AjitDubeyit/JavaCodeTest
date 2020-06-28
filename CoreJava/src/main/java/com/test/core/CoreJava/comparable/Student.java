package com.test.core.CoreJava.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
	
	int rollNo;
	int age;
	String name;
	
	public Student(int rollNo, int age, String name) {
		super();
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
	}

	public int compareTo(Student s) {
		if(age == s.age) {
			return 0;
		} else if(age>s.age) {
			return 1;
		} else {
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", age=" + age + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Student s = new Student(20,23,"Test1");
		Student s1 = new Student(19,17,"Test2");
		Student s2 = new Student(23,25,"Test3");
		
		List<Student> list = new ArrayList<Student>();
		list.add(s);
		list.add(s1);
		list.add(s2);
		Collections.sort(list);
		list.forEach(x -> System.out.println(x.toString()));
		
		
	}

}
