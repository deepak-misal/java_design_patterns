package com.techlab.model;

public class Ribbon extends HatDecorator{
	private Hat hat;
	
	public Ribbon(Hat hat) {
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
		return(hat.getDescription()+" and with red ribbon");
	}
}