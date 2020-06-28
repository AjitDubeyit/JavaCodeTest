package com.java8.demo.streamAPI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Sorting {
	public static void main(String[] args) {
		Student t = new Student(1, "Ajit", 21);
		Student t1 = new Student(2, "Ajit", 18);
		Student t2 = new Student(3, "Ajit", 28);
		Student t3 = new Student(4, "Jyoti", 21);
		Student t4 = new Student(5, "Jyoti", 30);
		Student t5 = new Student(6, "Bala", 21);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(t);
		studentList.add(t1);
		studentList.add(t2);
		studentList.add(t3);
		studentList.add(t4);
		studentList.add(t5);
		//studentList.forEach(x -> System.out.println(x.id));
		//Comparator<Student> sc = (s1,s2) -> s1.name.compareTo(s2.name);
		//studentList.sort(sc);
		//studentList.forEach(x -> System.out.println(x.name));
		//System.out.println(studentList);
		
		studentList.sort(Comparator.comparing(Student::getName).thenComparing(Student::getAge).reversed());
		
		for(Student s : studentList) {
			System.out.println(s.toString());
		}
		
		
		
		
	}
	

}
