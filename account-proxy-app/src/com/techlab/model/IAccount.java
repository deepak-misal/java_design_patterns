package com.techlab.model;

public interface IAccount {
	public void deposite(double amount);
	public void withdraw(double amount) throws Exception;
}
