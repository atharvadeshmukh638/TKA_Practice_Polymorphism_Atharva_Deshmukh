package com.TKA24_SEPT_98;

public class Account {
	String acc_No;
	String name;
	double balance;
	public Account() {
	}
	
	public Account(String acc_No, String name, double balance) {
		super();
		this.acc_No = acc_No;
		this.name = name;
		this.balance = balance;
	}
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit:" + amount);
	}
	void withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("withdraw:" + amount);
		} else {
			System.err.println("Insufficient balance");
		}

	}
	void calculateInterest() {
		System.out.println("Account Interest:");
	}
	void display() {
		System.out.println("Account number:"+acc_No);
		System.out.println("Name:"+name);
		System.out.println("balance:"+balance);
	}

}
