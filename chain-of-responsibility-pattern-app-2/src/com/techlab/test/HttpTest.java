package com.techlab.test;

import com.techlab.model.AuthenticationHandler;
import com.techlab.model.CompressionHandler;
import com.techlab.model.CookiesHandler;
import com.techlab.model.HttpRequestDTO;

public class HttpTest {

	public static void main(String[] args) throws Exception {
		CookiesHandler cookise=new CookiesHandler();
		AuthenticationHandler auth=new AuthenticationHandler();
		CompressionHandler compress=new CompressionHandler();
		cookise.setNext(auth);
		auth.setNext(compress);
		HttpRequestDTO dto=new HttpRequestDTO();
		dto.username="admin";
		dto.password="admin";
		cookise.check(dto);
	}

}
