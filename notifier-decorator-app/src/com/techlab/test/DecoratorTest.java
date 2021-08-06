package com.techlab.test;

import com.techlab.model.EmailNotifier;
import com.techlab.model.Notifier;
import com.techlab.model.StandardNotifier;
import com.techlab.model.WhatsappNotifier;

public class DecoratorTest {

	public static void main(String[] args) {
		
		Notifier notifier=new WhatsappNotifier(new EmailNotifier(new StandardNotifier()));
		
		System.out.println(notifier.sendMessage());
	}

}
