package com.TKA24_SEPT_98;

public class UPIPayment extends Payment {
	public UPIPayment(int paymentId, double amount) {
		super(paymentId, amount);
	}
	@Override
	void makePayment() {
		System.out.println("UPI Payment Processing");
		System.out.println("Amount Paid : " + amount);
	}
	@Override
	void generateReceipt() {
		System.out.println("UPI Receipt");
		System.out.println("Payment Id : " + paymentId);
 	}
}
