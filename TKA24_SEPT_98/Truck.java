package com.TKA24_SEPT_98;

public class Truck extends Vehicle {
	public Truck(int vechileNo, String brand, double rentPerDay) {
		super(vechileNo, brand, rentPerDay);
	}
	@Override
	void calculateRent(int days) {
		double rent = rentPerDay * days;
		double driverCharge = 1000.00;

		System.out.println("Number of Days : " + days);
		System.out.println("Driver Charge : " + driverCharge);
		System.out.println("Total Rent : " + (rent + driverCharge));
	}
	@Override
	void displayVehicleDetails() {
		System.out.println("Vehicle No : " + vehicleNo);
		System.out.println("Brand : " + brand);
	}

}
