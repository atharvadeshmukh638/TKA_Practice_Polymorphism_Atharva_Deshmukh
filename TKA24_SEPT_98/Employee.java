package com.TKA24_SEPT_98;

public class Employee {
	int empID;
	String name;
	double basicSalary;
	
	public Employee(int empID, String name, double basicSalary) {
		super();
		this.empID = empID;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	void calculateSalary() {
		System.out.println("Calculate Salary ");
	}
	void displayDetails() {
		System.out.println("Employee Id : " + empID);
		System.out.println("Name : "+name);
		System.out.println("Basic Salary : "+basicSalary);
	}
}
