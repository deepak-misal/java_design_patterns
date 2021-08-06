package com.techlab.model;

public class NormalHat implements Hat{

	@Override
	public String getName() {
		return("Normal Hat");
	}

	@Override
	public double getPrice() {
		return(100);
	}

	@Override
	public String getDescription() {
		return("Its normal hat");
	}

}
