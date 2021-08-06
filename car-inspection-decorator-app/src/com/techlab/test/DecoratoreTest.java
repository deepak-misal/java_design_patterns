package com.techlab.test;

import com.techlab.model.CarInspection;
import com.techlab.model.CarService;
import com.techlab.model.OilChange;
import com.techlab.model.TyreRotation;

public class DecoratoreTest {

	public static void main(String[] args) {
		
		CarService service=new TyreRotation(new OilChange(new CarInspection()));
		
		System.out.println(service.getCost());

	}

}
