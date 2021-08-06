package com.techlab.test;

import com.techlab.model.AutoType;
import com.techlab.model.BmwFactory;
import com.techlab.model.IAuto;
import com.techlab.model.IAutoFactory;

public class Test {

	public static void main(String[] args) {
		IAutoFactory factory=new BmwFactory();
		IAuto bmw=factory.make(AutoType.BMW);
		displayCar(bmw);
	}

	private static void displayCar(IAuto car) {
		car.start();
		car.stop();
		System.out.println(car.getName());
		
	}

}


