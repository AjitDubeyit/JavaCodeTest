package com.test.core.CoreJava.polymorphism;

class Dog {
	
	public void bark() {
		System.out.println("woof");
	}

}

class Hound extends Dog{
	public void sniff() {
		System.out.println("sniff");
	}
	
	public void bark() {
		System.out.println("howl");
	}
}

class DogShow{
	public static void main(String[] args) {
		
	}
	
	void go() {
		new Hound().bark();
		((Dog) new Hound()).bark();
		//((Dog) new Hound()).sniff();//It shows compile time error
	}
}
