package com.codifyd.adapter.assesment;

public class PaymentApp {
	
	PaymentAdapter ap = new PaymentAdapter();
	
	void pay(int rupees) {
		ap.pay(rupees);
	}
	
	public static void main(String[] args) {
		new PaymentApp().pay(140);
	}

}
