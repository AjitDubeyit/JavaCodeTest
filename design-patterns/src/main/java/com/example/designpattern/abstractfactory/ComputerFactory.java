package com.example.designpattern.abstractfactory;

import com.example.designpattern.abstractfactory.beans.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
