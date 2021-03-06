package com.hascode.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Object_Sorting {
	
	public static void main(String[] args) {
		
		
		Student s = new Student("ajit", 28);
		Student s1 = new Student("alok", 30);
		Student s2 = new Student("amit", 67);
		Student s3 = new Student("suresh", 64);
		
		List<Student> list = new ArrayList<Student>();
		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);
	
		//Comparator<Student> sort = (Student a1,Student a2) -> a1.getName().compareTo(a2.getName());
		//list.sort(sort);
		//list.forEach(student->System.out.println(student.toString()));
		
		System.out.println();
		
		//Collections.sort(list,Comparator.comparing(Student::getAge).thenComparing(Student::getName));
		//Collections.sort(list,Comparator.comparing(Student::getAge).reversed());
		//list.forEach(student->System.out.println(student.toString()));
		
		List<String> studentList = list.stream().map(x->x.getName()).collect(Collectors.toList());
		//studentList.forEach(x -> System.out.println(x));
		
		List<Student> stuList = list.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
		
	}

}

