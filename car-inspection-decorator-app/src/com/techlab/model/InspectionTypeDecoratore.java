package com.techlab.model;

public abstract class InspectionTypeDecoratore implements CarService{
	private CarService carService;
	public abstract double getCost();

}
