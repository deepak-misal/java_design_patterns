package com.techlab.model;

import java.time.LocalTime;

public class Account implements IAccount{
	private int accNo;
	private String accHolderName;
	private double balance;
	
	public Account(int accNo,String accHolderName,double balance) {
		this.accNo=accNo;
		this.accHolderName=accHolderName;
		this.balance=balance;
	}
	public int getAccNo() {
		return accNo;
	}
	
	public String getAccHolderName() {
		return accHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposite(double amount) {
		System.out.println("Before time:"+LocalTime.now());
		this.balance+=amount;
		System.out.println("After time:"+LocalTime.now());
	}
	
	public void withdraw(double amount) throws Exception {
		double minBalance=1000;
		if(this.balance-amount<minBalance) {
			throw new Exception("Can't withdraw money");
		}else {
			System.out.println("Before time:"+LocalTime.now());
			this.balance-=amount;
			System.out.println("After time:"+LocalTime.now());
		}
	}

}
