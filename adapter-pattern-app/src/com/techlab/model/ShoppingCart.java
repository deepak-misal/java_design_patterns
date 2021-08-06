package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> items=new ArrayList<Item>();
	double totalPrice=0;
	public void addItem(Item item) {
		items.add(item);
	}
	public void removeItem(Item item) {
		items.remove(item);
	}
	public void totalPrice() {
		for(Item item:items) {
			totalPrice+=item.itemPrice();
		}
	}
	public String toString() {
		return("item name:"+items.get(0).itemName()+" item price:"+items.get(0).itemPrice());
	}
}
