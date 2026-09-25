package com.TKA24_SEPT_98;

public class FoodItem {
	int itemID;
	String itemName;
	double price;
	public FoodItem(int itemID, String itemName, double price) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.price = price;
	}
	void calculatePrice() {
		System.out.println("Price:"+price);
	}
	void displayitem() {
		System.out.println("Item Id : " + itemID);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price : " + price);
	}

}
