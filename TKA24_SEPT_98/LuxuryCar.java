package com.TKA24_SEPT_98;

public class LuxuryCar extends Vehicle{
	public LuxuryCar(int vechileNo, String brand, double rentPerDay) {
		super(vechileNo, brand, rentPerDay);
	}
	@Override
	void calculateRent(int days) {
		double rent = rentPerDay * days;
		double insurance = 1000;
		double driverCharge = 1500;

		System.out.println("Number of Days : " + days);
		System.out.println("Insurance : " + insurance);
		System.out.println("Driver Charge : " + driverCharge);
		System.out.println("Total Rent : " + (rent + insurance + driverCharge));
 	}
	@Override
	void displayVehicleDetails() {
		System.out.println("Vehicle No : " + vehicleNo);
		System.out.println("Brand : " + brand);
 	}
	

}
