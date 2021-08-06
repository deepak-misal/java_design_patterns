package com.techlab.model;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal=new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
