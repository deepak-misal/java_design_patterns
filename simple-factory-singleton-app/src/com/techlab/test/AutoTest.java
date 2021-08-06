package com.techlab.test;

import com.techlab.model.AutoType;
import com.techlab.model.AutomobileFactory;
import com.techlab.model.IAuto;


public class AutoTest {
	public static void main(String[] args) {
		AutomobileFactory am1=AutomobileFactory.getInstance();
		AutomobileFactory am2=AutomobileFactory.getInstance();
		System.out.println(am1.hashCode());
		System.out.println(am2.hashCode());
		IAuto bmw=am1.make(AutoType.BMW);
		displayCar(bmw);
	}

	private static void displayCar(IAuto car) {
		car.start();
		car.stop();
		System.out.println(car.getName());
		System.out.println(car.hashCode());
		
	}
}
