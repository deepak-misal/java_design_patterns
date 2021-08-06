package com.techlab.model;

default class BMW implements IAuto{
	public default void start() {
		System.out.println("start working");
	}
	public default void stop() {
		System.out.println("stop working");
	}
	public default void getName() {
		System.out.println("name");
	}

}
