package com.techlab.test;

import com.techlab.model.BmwFactory;
import com.techlab.model.IAuto;
import com.techlab.model.IAutoFactory;

public class Test {

	public static void main(String[] args) {
		IAutoFactory factory=BmwFactory.getInstance();
		IAuto bmw=factory.make();
		bmw.getName();
		bmw.start();
		bmw.stop();
		System.out.println(factory.hashCode());
		IAutoFactory factory1=BmwFactory.getInstance();
		System.out.println(factory1.hashCode());
		
	}


}


