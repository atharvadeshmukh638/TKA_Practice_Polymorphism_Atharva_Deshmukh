package com.TKA24_SEPT_98;

public class CurrentAccount extends Account{

	public CurrentAccount(String acc_No, String name, double balance) {
		super(acc_No, name, balance);
	}
	@Override
	void withdraw(double amount) {
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println("Current Account withdraw:"+amount);
		}else {
			System.err.println("Current Account:Limit Exceed");
		}
 	}
	@Override
	void calculateInterest() {
		double interest=balance*0.02;
		System.out.println("Current Account Interest:"+interest);
 	}
	@Override
	void display() {
		System.out.println("Current Account number:"+acc_No);
		System.out.println("Name:"+name);
		System.out.println("balance:"+balance);
 	}
	

}
