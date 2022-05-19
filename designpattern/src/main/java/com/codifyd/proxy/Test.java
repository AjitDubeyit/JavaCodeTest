package com.codifyd.proxy;

public class Test {

	public static void main(String[] args) {
//		Customer cust = new CustomerImpl();
//		System.out.println(cust.getId());
//		System.out.println(cust.getOrders());
		
		Customer cust = new CustomerProxyImpl();
		System.out.println(cust.getId());
		System.out.println(cust.getOrders().size());
		
		
	}
}
