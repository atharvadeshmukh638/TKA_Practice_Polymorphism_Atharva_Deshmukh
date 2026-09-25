package com.TKA24_SEPT_98;

public class Manager extends Employee {
	public Manager(int empID, String name, double basicSalary) {
		super(empID, name, basicSalary);
 	}
	@Override
	void calculateSalary() {
		double basic_pay = 25000;
		double allowance = 15000;
		double bonus = 30000;
		basicSalary = basic_pay + allowance + bonus;
 
	}
	@Override
	void displayDetails() {
		System.out.println("Employee Id : " + empID);
		System.out.println("Name : " + name);
		System.out.println("Basic Salary : " + basicSalary);
	}
}	 