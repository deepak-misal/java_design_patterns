package com.techlab.model;

public class Cheese extends ToppingDecorator{
	private Pizza pizza;
	
	public Cheese(Pizza pizza){
		this.pizza=pizza;
	}

	@Override
	public int cost() {
		return pizza.cost()+10;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription()+" , Cheese.";
	}

}
