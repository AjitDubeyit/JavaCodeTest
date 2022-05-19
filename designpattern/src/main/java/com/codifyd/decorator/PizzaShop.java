package com.codifyd.decorator;

public class PizzaShop {
	
	public static void main(String[] args) {
		//Pizza pizza = new PlainPizza();
		//pizza.bake();
		
		//Pizza pizza = new CheesePizzaDecorator(new PlainPizza());
		//pizza.bake();
		
		Pizza pizza = new VeggiePizzaDecorator(new PlainPizza());
		pizza.bake();
	}
	
}
