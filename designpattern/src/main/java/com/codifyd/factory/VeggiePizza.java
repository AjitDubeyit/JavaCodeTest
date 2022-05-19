package com.codifyd.factory;



public class VeggiePizza implements Pizza {

	@Override
	public void bake() {
		System.out.println("Preparing veggie Pizza");

	}
	
	@Override
	public void prepare() {
		System.out.println("Baking veggie Pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting veggie Pizza");
	}


}
