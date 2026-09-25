package com.TKA24_SEPT_98;

public class Bike extends Vehicle {
	public Bike(int vechileNo, String brand, double rentPerDay) {
		super(vechileNo, brand, rentPerDay);
	}
	@Override
	void calculateRent(int days) {
		double rent = rentPerDay * days;
		double security = 300.00;

		System.out.println("Number of Days : " + days);
		System.out.println("Insurance : " + security);
		System.out.println("Total Rent : " + (rent + security));
	}
	@Override
	void displayVehicleDetails() {
		System.out.println("Vehicle No : " + vehicleNo);
		System.out.println("Brand : " + brand);
	}

}
