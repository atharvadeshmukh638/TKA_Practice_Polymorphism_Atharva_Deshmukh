package com.TKA24_SEPT_98;

public class Car extends Vehicle {

	public Car(int vechileNo, String brand, double rentPerDay) {
		super(vechileNo, brand, rentPerDay);
	}
	@Override
	void calculateRent(int days) {
		double rent=rentPerDay*days;
		double insurance=500.00;
		
		System.out.println("Number of Days : "+days);
		System.out.println("Insurance : "+insurance);
		System.out.println("Total Rent : "+(rent + insurance));
 	}
	@Override
	void displayVehicleDetails() {
		System.out.println("Vehicle No : "+vehicleNo);
		System.out.println("Brand : "+brand);
  	}
}
