package com.test.core.CoreJava.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.test.core.CoreJava.comparator.Student;

public class mainTest {

	public static void main(String[] args) {
		
		Student s = new Student(20,23,"Suresh");
		Student s1 = new Student(19,17,"Ajit");
		Student s2 = new Student(23,25,"Mahesh");
		
		List<Student> list = new ArrayList<Student>();
		list.add(s);
		list.add(s1);
		list.add(s2);
		
		//Comparator Old Style
		Collections.sort(list, new AgeComparator());
		list.forEach(x -> System.out.println(x.toString()));
	
		Collections.sort(list, new NameComparator());
		list.forEach(x -> System.out.println(x.toString()));
		
		//Java - 8
		Collections.sort(list,Comparator.comparing(Student::getAge).thenComparing(Student::getName));
		list.forEach(student->System.out.println(student.toString()));
	}
}
