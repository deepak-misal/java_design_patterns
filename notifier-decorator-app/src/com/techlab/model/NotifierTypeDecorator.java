package com.techlab.model;

public abstract class NotifierTypeDecorator implements Notifier {
	private Notifier notifier;
	public abstract String sendMessage();
}
