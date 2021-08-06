package com.techlab.model;

public class AudiFactory implements IAutoFactory{

	@Override
	public IAuto make(AutoType car) {
		if(car.equals(AutoType.AUDI))
		{
			return new Audi();
		}
		return null;
	}

}
