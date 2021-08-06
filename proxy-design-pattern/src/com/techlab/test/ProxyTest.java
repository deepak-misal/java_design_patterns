package com.techlab.test;

import com.techlab.model.MillenniumFalconProxy;
import com.techlab.model.Pilot;
import com.techlab.model.Spaceship;

public class ProxyTest {

	public static void main(String[] args) {
		Spaceship falcon1 = new MillenniumFalconProxy(new Pilot("Han Solo"));
	    falcon1.fly();

	    Spaceship falcon2 = new MillenniumFalconProxy(new Pilot("Deepak"));
	    falcon2.fly();

	}

}
