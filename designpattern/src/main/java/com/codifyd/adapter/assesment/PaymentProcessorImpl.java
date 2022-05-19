package com.codifyd.adapter.assesment;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public void pay(int dollars) {
		System.out.println("dollars payment service called for payment of dollar: "+dollars);

	}
}
