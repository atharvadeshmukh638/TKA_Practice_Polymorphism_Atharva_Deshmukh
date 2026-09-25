package com.TKA24_SEPT_98;

public class Vehicle {
	int vehicleNo;
	String brand;
	double rentPerDay;
	
	public Vehicle(int vechileNo, String brand, double rentPerDay) {
		super();
		this.vehicleNo = vechileNo;
		this.brand = brand;
		this.rentPerDay = rentPerDay;
	}
	void calculateRent(int days) {
		System.out.println("Rent:"+(rentPerDay*days));
	}
	void displayVehicleDetails() {
		System.out.println("Vehicle No : "+vehicleNo);
		System.out.println("Brand : "+brand);
		System.out.println("Rent Per Day : "+rentPerDay);
	}

}
