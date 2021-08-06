package com.techlab.model;

public class TeslaFactory implements IAutoFactory{

	@Override
	public IAuto make(AutoType car) {
		if(car.equals(AutoType.TESLA))
		{
			return new Tesla();
		}
		return null;
	}

}
