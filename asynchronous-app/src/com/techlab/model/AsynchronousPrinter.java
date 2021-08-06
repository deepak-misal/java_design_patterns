package com.techlab.model;

public class AsynchronousPrinter implements Runnable{

	@Override
	public void run() {
		while(true) {
        	System.out.println(java.time.LocalTime.now());
        }	
	}
}