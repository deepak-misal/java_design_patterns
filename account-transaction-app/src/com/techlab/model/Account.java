package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accNo;
	private String accHolderName;
	private double balance;
	private List<Transaction> transactions=new ArrayList<Transaction>();
	List<Account> bank=new ArrayList<Account>();
	
	public Account(int accNo,String accHolderName,double balance) {
		this.accNo=accNo;
		this.accHolderName=accHolderName;
		this.balance=balance;
		String summary="$" + Double.toString(balance) + " was deposited.";
		transactions.add(new Transaction(balance,summary));
		bank.add(this);
		
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
		this.balance+=amount;
		String summary="$" + Double.toString(amount) + " was deposited.";
		transactions.add(new Transaction(amount,summary));
	}
	
	public void withdraw(double amount) throws Exception {
		double minBalance=1000;
		String summary="$" + Double.toString(amount) + " was withdrawn.";
		if(this.balance-amount<minBalance) {
			throw new Exception("Can't withdraw money");
		}else {
			this.balance-=amount;
			transactions.add(new Transaction(amount,summary));
		}
	}
	
	public String getTransaction() {
		String msg = null;
		for(Transaction transaction:transactions) {
			msg=transaction.toString();
		}
		return msg;
	}
	
	public List<String> getAllTransaction() {
		List<String> msg=new ArrayList<String>();
		for(Transaction transaction:transactions) {
			msg.add(transaction.toString());
		}
		return msg;
	}
	
}
