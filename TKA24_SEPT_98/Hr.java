package com.TKA24_SEPT_98;

public class Hr extends Employee{

	public Hr(int empID, String name, double basicSalary) {
		super(empID, name, basicSalary);
 	}
	@Override
	void calculateSalary() {
		double basic_pay = 16000;
		double allowance = 6000;
		double bonus = 20000;
		basicSalary = basic_pay + allowance + bonus;
 
	}
	@Override
	void displayDetails() {
		System.out.println("Employee Id : " + empID);
		System.out.println("Name : " + name);
		System.out.println("Basic Salary : " + basicSalary);
	}

}
