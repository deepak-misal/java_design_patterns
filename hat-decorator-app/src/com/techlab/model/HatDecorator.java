package com.techlab.model;

public abstract class HatDecorator implements Hat{
	private Hat hat;
	public abstract String getName();
	public abstract double getPrice();
	public abstract String getDescription();
}
