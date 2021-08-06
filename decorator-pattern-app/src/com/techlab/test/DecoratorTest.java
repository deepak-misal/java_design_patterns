package com.techlab.test;

import com.techlab.model.Cheese;
import com.techlab.model.Pizza;
import com.techlab.model.ThickcrustPizza;

public class DecoratorTest {

	public static void main(String[] args) {
		Pizza pizza=new ThickcrustPizza();
		Pizza cheesePizza=new Cheese(pizza);
		
		System.out.println(cheesePizza.getDescription()+" Price:"+cheesePizza.cost()+"Rs.");

	}

}
