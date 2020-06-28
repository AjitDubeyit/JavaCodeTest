package com.example.designpattern.abstractfactory;

import com.example.designpattern.abstractfactory.beans.Computer;
import com.example.designpattern.abstractfactory.beans.Server;

public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String cpu;
	private String hdd;
	
	public ServerFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}
	
	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Server(this.ram, this.hdd, this.cpu);
	}

}
