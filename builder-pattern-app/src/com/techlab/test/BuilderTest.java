package com.techlab.test;

import com.techlab.model.Meal;
import com.techlab.model.MealBuilder;

public class BuilderTest {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
	}

}
