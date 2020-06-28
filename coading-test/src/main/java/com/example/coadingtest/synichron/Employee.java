package com.example.coadingtest.synichron;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Employee {
	String fName;
	String lname;
	int age;
	long salary;
	

	public Employee(String fName, String lname, int age, long salary) {
		super();
		this.fName = fName;
		this.lname = lname;
		this.age = age;
		this.salary = salary;
	}
	
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("Mahesh","Patil", 29, 20000);
		Employee employee2 = new Employee("Sanjay","Pawar", 30, 40000);
		Employee employee3 = new Employee("Jitin","narayan", 25, 10000);
		Employee employee4 = new Employee("Amar", "mhatre", 31, 5000);
		Employee employee5 = new Employee("Rjesh", "roy", 30, 15000);
		Employee employee6 = new Employee("Jyoti", "Mishra", 27, 100000);
		
		List<Employee> employeeList = new ArrayList<Employee>();
	    
		employeeList.add(employee1);
		employeeList.add(employee5);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee6);
		
		
		
		List<Employee> empList = employeeList.stream()
	    .filter(e -> e.getAge() > 26).sorted((emp1,emp2) -> emp1.getfName().compareTo(emp2.getfName())).collect(Collectors.toList());

		for(Employee e : empList)
		{
			System.out.println(e.getfName()+" Age: "+e.getAge());
		}
	}

}
