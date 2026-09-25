package com.TKA24_SEPT_98;

public class Burger extends Pizza {
	public Burger(int itemID, String itemName, double price) {
		super(itemID, itemName, price);
	}
	@Override
	void calculatePrice() {
		double cheeseCharge = 50;
		double toppingCharge = 30;

		System.out.println("Cheese Charge : " + cheeseCharge);
		System.out.println("Topping Charge : " + toppingCharge);
		System.out.println("Total Price : " + (price + cheeseCharge + toppingCharge));
	}
}
