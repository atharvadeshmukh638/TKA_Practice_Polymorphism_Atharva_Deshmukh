package com.TKA24_SEPT_98;

public class EmployeeMain {
	void generateSalarySlip(Employee emp) {
		System.out.println("Salary Slip : ");
		emp.calculateSalary();
		emp.displayDetails();
		System.out.println("--------------------");
	}
	public static void main(String[] args) {

		EmployeeMain em = new EmployeeMain();
		Employee e1 = new Developer(101, "Atharva", 30000);
		System.out.println("Developer : ");
		em.generateSalarySlip(e1);

		Employee e2 = new Tester(102, "Swapnil", 25000);
		System.out.println("\nTester:");
		em.generateSalarySlip(e2);

		Employee e3 = new Manager(103, "Suyash", 50000);
		System.out.println("\nManager:");
		em.generateSalarySlip(e3);

		Employee e4 = new Hr(104, "ShreeRam", 35000);
		System.out.println("\nHR :");
		em.generateSalarySlip(e4);
	}
}