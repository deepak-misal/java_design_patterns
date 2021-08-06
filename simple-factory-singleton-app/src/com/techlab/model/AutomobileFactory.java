package com.techlab.model;

public class AutomobileFactory {
	private static AutomobileFactory factory;
	
	public IAuto make(AutoType type) {
		if(type==AutoType.BMW) {
			return new Bmw();
		}
		if(type==AutoType.AUDI) {
			return new Audi();
		}
		if(type==AutoType.TESLA) {
			return new Tesla();
		}
		return null;
	}
	public static AutomobileFactory getInstance() {
		if(factory==null) {
			synchronized(AutomobileFactory.class) {
				if(factory==null) {
					factory=new AutomobileFactory();
				}
			}
		}
		return factory;
	}
	
}
