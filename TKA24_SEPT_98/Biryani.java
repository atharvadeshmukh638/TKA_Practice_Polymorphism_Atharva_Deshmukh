package com.TKA24_SEPT_98;

public class Biryani extends FoodItem {
	public Biryani(int itemID, String itemName, double price) {
		super(itemID, itemName, price);
	}
	@Override
	void calculatePrice() {
		double quantityCharge = 150;
		double sideCharge = 100;
		System.out.println("Quantity Charge : " + quantityCharge);
		System.out.println("Side Charge : " + sideCharge);
		System.out.println("Total Price : " + (price + quantityCharge + sideCharge));
	}
}
