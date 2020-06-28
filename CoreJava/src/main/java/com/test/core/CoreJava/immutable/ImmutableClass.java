package com.test.core.CoreJava.immutable;

public final class ImmutableClass {
	final String name;
	final int regNo;
	
	public ImmutableClass(String name, int regNo) {
		this.name=name;
		this.regNo=regNo;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}
	
	public static void main(String[] args) {
		ImmutableClass ic = new ImmutableClass("Ajit", 101);
		System.out.println(ic.getName());
		System.out.println(ic.getRegNo());
	}
}
