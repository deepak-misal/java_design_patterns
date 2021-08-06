package com.techlab.model;

public class EmailNotifier extends NotifierTypeDecorator{
	Notifier notifier;
	
	public EmailNotifier(Notifier notifier) {
		this.notifier=notifier;
	}

	@Override
	public String sendMessage() {
		return(notifier.sendMessage()+" sent via Email");
		
	}

}
