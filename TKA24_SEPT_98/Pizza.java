package com.TKA24_SEPT_98;

public class Pizza extends FoodItem {
	public Pizza(int itemID, String itemName, double price) {
		super(itemID, itemName, price);
	}
	@Override
	void calculatePrice() {
		double sizeCharge = 200;
		double toppingCharge = 100;

		System.out.println("Size Charge:" + sizeCharge);
		System.out.println("Topping Charge:" + toppingCharge);
		System.out.println("Total Price:" + (price + sizeCharge + toppingCharge));
	}
}
