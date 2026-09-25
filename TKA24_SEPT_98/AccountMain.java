package com.TKA24_SEPT_98;

public class AccountMain {
	
	public static void main(String[] args) {
		
		Account a1 = new SavingAcccount("101", "Atharva", 5000.00);
		System.out.println("Saving Account : ");
		a1.deposit(3000.00);
		a1.withdraw(4000.00);
		a1.calculateInterest();
		a1.display();

		Account a2 = new CurrentAccount("102", "Swapnil", 7000.00);
		System.out.println("\nCurrent Account : ");
		a2.deposit(5000.00);
		a2.withdraw(3000.00);
		a2.calculateInterest();
		a2.display();

		Account a3 = new SalaryAccount("103", "Suyash", 4000.00);
		System.out.println("\nSalary Account :");
		a3.deposit(9000.00);
		a3.withdraw(4000.00);
		a3.calculateInterest();
		a3.display();

	}

}
