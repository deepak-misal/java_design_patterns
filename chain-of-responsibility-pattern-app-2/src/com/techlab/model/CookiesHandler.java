package com.techlab.model;

public class CookiesHandler extends Handler{

	@Override
	public void check(HttpRequestDTO dto) throws Exception {
		System.out.println("writing into cookies");
		this.checkNext(dto);
		
	}

}
