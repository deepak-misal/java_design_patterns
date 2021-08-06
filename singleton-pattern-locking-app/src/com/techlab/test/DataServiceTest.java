package com.techlab.test;


import com.techlab.model.DataService;

public class DataServiceTest {

	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			public void run() {
				DataService dsv1=DataService.getInstance();
			}
		});
		Thread t2=new Thread(new Runnable() {
			public void run() {
				DataService dsv2=DataService.getInstance();
			}
		});
		t1.start();
		t2.start();
	}

}