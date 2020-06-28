package com.example.designpattern.abstractfactory;

import com.example.designpattern.abstractfactory.beans.Computer;
import com.example.designpattern.abstractfactory.beans.PC;

public class PCFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}
	
	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new PC(this.ram, this.cpu, this.hdd);
	}

}
