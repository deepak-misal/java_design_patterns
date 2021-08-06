package com.techlab.model;

public class WhatsappNotifier  extends NotifierTypeDecorator{
	Notifier notifier;
	
	public WhatsappNotifier(Notifier notifier) {
		this.notifier=notifier;
	}

	@Override
	public String sendMessage() {
		return(notifier.sendMessage()+" sent via Whatsapp");
		
	}

}
