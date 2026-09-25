package com.TKA24_SEPT_98;

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle v1 = new Car(101, "Honda", 2000);
        System.out.println("Car : ");
        v1.displayVehicleDetails();
        v1.calculateRent(3);

        Vehicle v2 = new Bike(102, "Yamaha", 1000);
        System.out.println("\nBike : ");
        v2.displayVehicleDetails();
        v2.calculateRent(4);

        Vehicle v3 = new Truck(103, "Tata", 5000);
        System.out.println("\nTruck : ");
        v3.displayVehicleDetails();
        v3.calculateRent(2);

        Vehicle v4 = new LuxuryCar(104, "BMW", 8000);
        System.out.println("\nLuxury Car : ");
        v4.displayVehicleDetails();
        v4.calculateRent(3);
    }
}