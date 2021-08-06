package com.techlab.model;

public abstract class ToppingDecorator implements Pizza{
	private Pizza pizza;
	public abstract String getDescription();
}
