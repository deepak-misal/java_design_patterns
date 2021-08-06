package com.techlab.subscriber.test;

import com.techlab.publisher.Account;
import com.techlab.subscriber.EmailNotifier;
import com.techlab.subscriber.SmsNotifier;

public class AccNotificationTest {

	public static void main(String[] args) {
		Account acc1=new Account(1,"abc",2000);
		acc1.addNotifier(new SmsNotifier());
		acc1.addNotifier(new EmailNotifier());
		acc1.deposite(1000);
		acc1.sendNotification();

	}

}
