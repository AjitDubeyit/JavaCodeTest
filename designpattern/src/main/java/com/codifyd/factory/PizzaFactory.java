package com.codifyd.factory;

public class PizzaFactory {

	public static Pizza createPizza(String type) {
		
		Pizza p = null;
		if(type.equalsIgnoreCase("cheese")) {
			p = new CheesePizza();
		} else if(type.equalsIgnoreCase("chicken")) {
			p = new ChickenPizza();
		} else if(type.equalsIgnoreCase("Veggie")) {
			p = new VeggiePizza();
		}
		return p;
	}
}
