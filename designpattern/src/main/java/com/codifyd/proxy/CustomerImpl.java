package com.codifyd.proxy;

import java.util.List;

public class CustomerImpl implements Customer {

	private int id;
	private List<Order> orders;
	
	public CustomerImpl() {
		this.id=123;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public int getId() {
		return id;
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	
	
}
