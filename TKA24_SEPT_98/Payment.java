package com.TKA24_SEPT_98;

public class Payment {
	int paymentId;
	double amount;

	public Payment(int paymentId, double amount) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
	}
	void makePayment() {
		System.out.println("Make Payment");
	}
	void generateReceipt() {
		System.out.println("Generate Receipt");
	}
}
