package com.techlab.test;

import com.techlab.model.Account;


public class AccountTransactionTest {
	public static void main(String[] args) throws Exception {
		
		
		Account a1=new Account(1,"deepak",3000);
		Account a2=new Account(2,"abc",5000);
		printAccountInfo(a1);
		a1.deposite(1000);
		printAccountInfo(a1);
		a1.withdraw(500);
		printAccountInfo(a1);
		a2.deposite(200);
		printAccountInfo(a2);
		System.out.println(a1.getAllTransaction()+"\n");
		
	}

	private static void printAccountInfo(Account a1) {
		System.out.println("Account Number:"+a1.getAccNo());
		System.out.println("Account Holder Name:"+a1.getAccHolderName());
		System.out.println("Account Balance:"+a1.getBalance());
		System.out.println(""+a1.getTransaction());
		System.out.println("");
	}
}
