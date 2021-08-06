package com.techlab.test;

import com.techlab.model.AccountProxy;

public class ProxyTest {

	public static void main(String[] args) throws Exception {
		AccountProxy account=new AccountProxy(1,"abc",2000);
		account.deposite(1000);
		account.deposite(200);
		account.withdraw(200);
	}




}
