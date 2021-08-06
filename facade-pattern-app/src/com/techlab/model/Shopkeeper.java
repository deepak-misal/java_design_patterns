package com.techlab.model;

public class Shopkeeper {
	private IMobileShop iphone;
	private IMobileShop samsung;
	private IMobileShop blackberry;

	public Shopkeeper() {
		iphone = new IPhone();
		samsung = new Samsung();
		blackberry = new Blackberry();
	}

	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}

	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}

	public void blackberrySale() {
		blackberry.modelNo();
		blackberry.price();
	}
}
