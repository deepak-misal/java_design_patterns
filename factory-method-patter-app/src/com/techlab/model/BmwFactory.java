package com.techlab.model;

public class BmwFactory implements IAutoFactory{

	@Override
	public IAuto make(AutoType car) {
		if(car.equals(AutoType.BMW))
		{
			return new Bmw();
		}
		return null;
	}

}
