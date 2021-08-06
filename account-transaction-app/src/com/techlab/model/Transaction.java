package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
	private double amount;
	private String summary;
	
	
	
	public Transaction(double amount,String summary) {
		this.amount=amount;
		this.summary=summary;
	}
	public double getAmount() {
		return amount;
	}
	public String getSummary() {
		return summary;
	}
	public String toString() {
		return("Transaction Details: "+"amount: "+getAmount()+"  summary: "+getSummary());
	}
}
