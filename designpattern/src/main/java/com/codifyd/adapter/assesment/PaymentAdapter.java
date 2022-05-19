package com.codifyd.adapter.assesment;

public class PaymentAdapter {
	
	PaymentProcessor p = new PaymentProcessorImpl();
	
	public void pay(int rupees) {
		int dollor = rupees/70;
		System.out.println("Rupees "+rupees+" converted into dollor: "+dollor);
		p.pay(dollor);
	}
}
