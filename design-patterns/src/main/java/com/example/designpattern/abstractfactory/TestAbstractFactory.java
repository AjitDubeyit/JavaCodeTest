package com.example.designpattern.abstractfactory;
import com.example.designpattern.abstractfactory.beans.Computer;
public class TestAbstractFactory {

	public static void main(String[] args) {
		TestAbstractFactory testAbstractFactory = new TestAbstractFactory();
		testAbstractFactory.testAbstractFactory();
	}
	
	private static void testAbstractFactory() {
		Computer pc = new ComputerFactory().getComputer(new PCFactory("2 GB", "500GB", "Core i5"));
		Computer server = new ComputerFactory().getComputer(new ServerFactory("16 GB", "4 TB", "Core i9"));
		Computer laptop = new ComputerFactory().getComputer(new LaptopFactory("8 GB", "1 TB", "Core i3"));
		System.out.println("PC Configuration : " + pc);
		System.out.println("Server Configuration : " + server);
		System.out.println("Laptop configuration : " + laptop);
	}
}
/*
-> Abstract Factory provides abstraction for Factories where as Factory pattern provides abstraction for concrete products
-> Better abstraction than factory pattern
-> No if else or switch case logic like factory pattern
-> Loosely coupled(if we need to add new functionality than we don't want to touch existing code)
-> Removes burden from client to factory
-> Easy to extend
*/