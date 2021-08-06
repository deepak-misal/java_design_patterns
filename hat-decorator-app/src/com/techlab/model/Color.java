package com.techlab.model;

public class Color extends HatDecorator{
	private Hat hat;
	
	public Color(Hat hat) {
		this.hat=hat;
	}

	@Override
	public String getName() {
		return(hat.getName());
	}

	@Override
	public double getPrice() {
		return(hat.getPrice()+30);
	}

	@Override
	public String getDescription() {
		return(hat.getDescription()+" with golden color");
	}

}
