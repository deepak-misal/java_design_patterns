package com.techlab.model;

public class ThickcrustPizza implements Pizza{
	private String description;
	private int price;
	
	public ThickcrustPizza() {
		this.description="Thick crust pizza with tomato sauce";
		this.price=30;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public int cost() {
		return price;
	}

}
