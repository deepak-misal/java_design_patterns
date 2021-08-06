package com.techlab.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accNo;
	private String name;
	private double balance;
	List<INotifier> notifiers=new ArrayList<INotifier>();
	public Account(int accNo,String name,double balance) {
		this.accNo=accNo;
		this.name=name;
		this.balance=balance;
	}
	public void deposite(double amount) {
		this.balance=this.balance+amount;
	}
	public void withdraw(double amount) {
		double minimum_balance=1000;
		if(this.balance>minimum_balance) {
			this.balance=this.balance-amount;
		}
		else {
			System.out.println("withdraw nnot possible");
		}
	}
	public double getBalance() {
		return balance;
	}
	public void addNotifier(INotifier notifier) {
		notifiers.add(notifier);
	}
	public void sendNotification() {
		for(INotifier notifier:notifiers) {
			notifier.notify(this);
		}
	}

}
