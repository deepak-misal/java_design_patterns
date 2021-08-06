package com.techlab.model;

public class ThincrustPizza implements Pizza{
	private String description;
	private int price;
	
	public ThincrustPizza() {
		this.description="Thin crust pizza with tomato sauce";
		this.price=20;
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
