package com.TKA24_SEPT_98;

public class Beverage extends FoodItem {
	public Beverage(int itemID, String itemName, double price) {
		super(itemID, itemName, price);
	}
    @Override
    void calculatePrice() {
        double sizeCharge = 200;
        double addOnCharge = 150;
        System.out.println("Size Charge : "+sizeCharge);
        System.out.println("Add-On Charge : "+addOnCharge);
        System.out.println("Total Price : " +(price+sizeCharge+addOnCharge));
    }
}
	
