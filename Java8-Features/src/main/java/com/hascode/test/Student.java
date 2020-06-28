package com.hascode.test;

public class Student {
	
	String name;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	

}
