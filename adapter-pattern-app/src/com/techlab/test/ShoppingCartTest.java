package com.techlab.test;

import com.techlab.model.ShoppingCart;

import ExtrnalLibrary.Hat;
import ExtrnalLibrary.HatAdapter;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart=new ShoppingCart();
		cart.addItem(new HatAdapter(new Hat("abc","xyz",50)));
		printDetail(cart);

	}

	private static void printDetail(ShoppingCart cart) {
		System.out.println(cart);
		
	}

}
