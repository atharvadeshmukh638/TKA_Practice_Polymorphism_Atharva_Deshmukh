package com.TKA24_SEPT_98;
import java.util.*;

public class FoodMain {
	public static void main(String[] args) {
		ArrayList<FoodItem> food = new ArrayList<FoodItem>();

		FoodItem f1 = new Pizza(101, "Paneer & Onion Pizza", 500);
		FoodItem f2 = new Burger(102, "CAMP Burger", 200);
		FoodItem f3 = new Biryani(103, "PK Biryani", 300);
		FoodItem f4 = new Dessert(104, "Rasmalai", 150);
		FoodItem f5 = new Beverage(105, "Red Bull", 100);

		food.add(f1);
		food.add(f2);
		food.add(f3);
		food.add(f4);
		food.add(f5);

		for (FoodItem f : food) {
			System.out.println("\nFood Item : ");
			f.displayitem();
			f.calculatePrice();
			System.out.println("--------------------");
		}
	}
}
