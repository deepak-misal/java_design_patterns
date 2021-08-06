package com.techlab.model;

public class TyreRotation extends InspectionTypeDecoratore{
	private CarService carService;
	
	public TyreRotation(CarService carService) {
		this.carService=carService;
	}
	@Override
	public double getCost() {
		return carService.getCost()+1000;
	}
}
