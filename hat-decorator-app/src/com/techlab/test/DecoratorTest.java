package com.techlab.test;

import com.techlab.model.Color;
import com.techlab.model.Hat;
import com.techlab.model.Ribbon;
import com.techlab.model.StandardHat;

public class DecoratorTest {

	public static void main(String[] args) {
		Hat hat=new Ribbon(new Color(new StandardHat()));
		
		System.out.println("Name of Hat:"+hat.getName());
		System.out.println("Price of Hat:"+hat.getPrice());
		System.out.println("Hat Description:"+hat.getDescription());

	}

}
