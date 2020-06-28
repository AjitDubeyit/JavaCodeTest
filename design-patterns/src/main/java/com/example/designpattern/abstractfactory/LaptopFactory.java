package com.example.designpattern.abstractfactory;

import com.example.designpattern.abstractfactory.beans.Computer;
import com.example.designpattern.abstractfactory.beans.Laptop;

public class LaptopFactory implements ComputerAbstractFactory {
	
	private String ram;
	private String cpu;
	private String hdd;
	
	public LaptopFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}
	@Override
	public Computer createComputer() {
		return new Laptop(this.ram, this.cpu, this.hdd);
	}

}
