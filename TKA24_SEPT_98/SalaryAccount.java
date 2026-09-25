package com.TKA24_SEPT_98;

public class SalaryAccount extends Account {

	public SalaryAccount(String acc_No, String name, double balance) {
	}

	@Override
	void withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("Salary Account withdraw:" + amount);
		} else {
			System.out.println("Salary Account:Insufficient Balance:");
		}
	}

	@Override
	void calculateInterest() {
		double interest = balance * 0.05;
		System.out.println("Salary Account Interest:" + interest);
	}

	@Override
	void display() {
		System.out.println("Salary Account number:" + acc_No);
		System.out.println("Name:" + name);
		System.out.println("balance:" + balance);
	}

}
