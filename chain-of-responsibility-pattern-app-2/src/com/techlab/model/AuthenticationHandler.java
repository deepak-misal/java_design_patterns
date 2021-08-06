package com.techlab.model;

public class AuthenticationHandler extends Handler{

	@Override
	public void check(HttpRequestDTO dto) throws Exception {
		System.out.println("Doing Authentication");
		if(dto.username!="admin"||dto.password!="admin") {
			throw new Exception("Invalid login credentials");
		}
		else {
			this.checkNext(dto);
		}
		
	}

}
