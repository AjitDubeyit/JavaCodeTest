package com.test.core.CoreJava.clonableInterface.deepCopy;

import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String email;
	private String password;
	private Address address;
	private final Date dob;
	
	public Employee(int id, String name, int age, String email, String password, Address address, Date dob) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.address = address;
		this.dob = dob;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", password=" + password
				+ ", address=" + address + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee e = (Employee)super.clone();
		e.setAddress(new Address(getAddress().getId(), getAddress().getAddressLine1(), getAddress().getAddressLine2(), getAddress().getCity(), getAddress().getZipCode()));
		return e;
	}
}
