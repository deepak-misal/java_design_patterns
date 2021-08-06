package com.techlab.model;

public class OilChange extends InspectionTypeDecoratore{
	private CarService carService;
	
	public OilChange(CarService carService) {
		this.carService=carService;
	}
	@Override
	public double getCost() {
		return carService.getCost()+500;
	}

}
