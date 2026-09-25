package com.TKA24_SEPT_98;

public class SavingAcccount extends Account{

	public SavingAcccount(String acc_No, String name, double balance) {
		super(acc_No, name, balance);
	}

	@Override
	void withdraw(double amount) {
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println("Saving Account Withdraw:"+amount);
		}else {
			System.err.println("Saving acccount Insufficient Balance");
		}
 	}
	@Override
	void calculateInterest() {
		double interest=balance*0.04;
		System.out.println("Saving Account Interest:"+interest);
 	}

	@Override
	void display() {
		System.out.println("Saving Account number:"+acc_No);
		System.out.println("Name:"+name);
		System.out.println("balance:"+balance);
 	}
	

}
