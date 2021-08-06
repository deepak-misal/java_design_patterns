package com.techlab.model;

public class AccountProxy implements IAccount{
	private Account account;
	private int accNo;
	private String accHolderName;
	private double balance;
	
	public AccountProxy(int accNo,String accHolderName,double balance) {
		this.accNo=accNo;
		this.accHolderName=accHolderName;
		this.balance=balance;
	}

	@Override
	public void deposite(double amount) {
		if(account==null) {
			account=new Account(accNo,accHolderName,balance);
		}
		account.deposite(amount);
		printInfo(account);
		
	}
	@Override
	public void withdraw(double amount) throws Exception {
		if(account==null) {
			account=new Account(accNo,accHolderName,balance);
		}
		account.withdraw(amount);
		printInfo(account);
		
	}
	
	private void printInfo(Account account2) {
		System.out.println("Account Number"+account2.getAccNo());
		System.out.println("Account Holder Name:"+account2.getAccHolderName());
		System.out.println("Balance:"+account2.getBalance());
		System.out.println("");
		
	}

}
