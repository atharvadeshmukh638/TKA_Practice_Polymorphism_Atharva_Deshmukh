package com.TKA24_SEPT_98;

public class Dessert extends FoodItem{
	public Dessert(int itemID, String itemName, double price) {
		super(itemID, itemName, price);
	}
	@Override
	void calculatePrice() {
		double quantityCharge=120;
		double toppingCharge=70;
        System.out.println("Quantity Charge : " + quantityCharge);
        System.out.println("Topping Charge : " + toppingCharge);
        System.out.println("Total Price : " + (price + quantityCharge + toppingCharge));
 	}
	@Override
	void displayitem() {
		System.out.println("Item Id : " + itemID);
		System.out.println("Item Name : " + itemName);
 	}

}
