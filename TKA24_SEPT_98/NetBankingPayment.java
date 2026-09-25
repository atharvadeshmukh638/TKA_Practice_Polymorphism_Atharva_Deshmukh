package com.TKA24_SEPT_98;

public class NetBankingPayment extends Payment {
	public NetBankingPayment(int paymentId, double amount) {
		super(paymentId, amount);
	}
	@Override
	void makePayment() {
		System.out.println("Net Banking Payment Processing");
		System.out.println("Amount Paid : " + amount);
	}
	@Override
	void generateReceipt() {
		System.out.println("Net Banking Receipt");
		System.out.println("Payment Id : " + paymentId);
 	}
}
