package com.TKA24_SEPT_98;

public class Tester extends Employee {
	Tester(int empId, String name, double basicSalary) {
		super(empId, name, basicSalary);
	}
	@Override
	void calculateSalary() {
		double basic_pay = 11000;
		double allowance = 9000;
		double bonus = 15000;
		basicSalary = basic_pay + allowance + bonus;
 
	}
	@Override
	void displayDetails() {
		System.out.println("Employee Id : " + empID);
		System.out.println("Name : " + name);
		System.out.println("Final salary : " + basicSalary);
	}
}
