package com.techlab.subscriber;

import com.techlab.publisher.Account;
import com.techlab.publisher.INotifier;

public class SmsNotifier implements INotifier{

	@Override
	public void notify(Account acc) {
		System.out.println("notification is sent via SMS");
		System.out.println("balance:"+acc.getBalance());
	}

}
