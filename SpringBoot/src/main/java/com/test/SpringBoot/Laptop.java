package com.test.SpringBoot;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
	private int aid;
	private String brand;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [aid=" + aid + ", brand=" + brand + "]";
	}
	
	public void compile() {
		System.out.println("compiling");
	}

}
