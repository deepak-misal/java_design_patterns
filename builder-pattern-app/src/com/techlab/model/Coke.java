package com.techlab.model;

public abstract class Coke implements Item{
	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract int price();
}

