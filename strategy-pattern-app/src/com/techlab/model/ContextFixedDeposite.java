package com.techlab.model;

public class ContextFixedDeposite {
	private IStrategyFestivalRate strategyFestRate;
	private int principle;
	private double interest;
	private int years;
	public ContextFixedDeposite(int principle,int years,IStrategyFestivalRate strategyFestRate) {
		this.principle=principle;
		this.years=years;
		this.strategyFestRate=strategyFestRate;
	}
	public double calculateSimpleInterest() {
		interest=(principle*strategyFestRate.getRate()*years)/100;
		return interest;
	}

}
