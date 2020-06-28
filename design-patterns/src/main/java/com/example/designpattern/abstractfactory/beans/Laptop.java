package com.example.designpattern.abstractfactory.beans;

public class Laptop extends Computer {

	private String ram;
	private String cpu;
	private String hdd;
	
	public Laptop(String ram, String cpu, String hdd) {
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

	@Override
	public String getRAM() {
		return ram;
	}

	@Override
	public String getHDD() {
		return hdd;
	}

	@Override
	public String getCPU() {
		return cpu;
	}

}
