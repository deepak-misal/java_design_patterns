package com.techlab.model;

public class StandardHat implements Hat{

	@Override
	public String getName() {
		return("Standard hat");
	}

	@Override
	public double getPrice() {
		return(200);
	}

	@Override
	public String getDescription() {
		return("It's a Standard hat");
	}

}
