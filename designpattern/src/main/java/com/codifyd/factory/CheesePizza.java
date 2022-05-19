package com.codifyd.factory;



public class CheesePizza implements Pizza {

	@Override
	public void bake() {
		System.out.println("Preparing Veggie Pizza");

	}
	
	@Override
	public void prepare() {
		System.out.println("Baking Veggie Pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting Veggie Pizza");
	}


}
