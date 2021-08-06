package com.techlab.test;

import com.techlab.model.ContextFixedDeposite;
import com.techlab.model.DiwaliRate;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		ContextFixedDeposite cfd=new ContextFixedDeposite(2000,4,new DiwaliRate());
		System.out.println("Simple Interest:"+cfd.calculateSimpleInterest());

	}

}
