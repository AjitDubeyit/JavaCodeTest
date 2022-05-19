package com.codifyd.factory;



public class ChickenPizza implements Pizza {

	@Override
	public void bake() {
		System.out.println("Preparing chicken Pizza");

	}
	
	@Override
	public void prepare() {
		System.out.println("Baking chicken Pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting chicken Pizza");
	}


}
