package com.TKA24_SEPT_98;

public class CreditCardPayment extends Payment {
	public CreditCardPayment(int paymentId, double amount) {
		super(paymentId, amount);
	}
	@Override
	void makePayment() {
		System.out.println("Credit Card Payment Processing");
		System.out.println("Amount Paid : " + amount);
	}
	@Override
	void generateReceipt() {
		System.out.println("Credit Card Receipt");
		System.out.println("Payment Id : " + paymentId);
 	}
}
