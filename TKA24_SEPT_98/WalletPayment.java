package com.TKA24_SEPT_98;

public class WalletPayment extends Payment {
	public WalletPayment(int paymentId, double amount) {
		super(paymentId, amount);
	}
	@Override
	void makePayment() {
		System.out.println("Wallet Payment Processing");
		System.out.println("Amount Paid : " + amount);
	}
	@Override
	void generateReceipt() {
		System.out.println("Wallet Receipt");
		System.out.println("Payment Id : " + paymentId);
 	}
}
