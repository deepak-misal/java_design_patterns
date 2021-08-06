package com.techlab.model;

public class LockChecker extends HomeSecurityChecker{

	@Override
	public void check(HomeStatusDTO dto) throws Exception {
		System.out.println("checking locks");
		if(!dto.LocksOn) {
			throw new Exception("Locks are on");
		}
		else {
			System.out.println("we can go for outing");
		}
		
	}

}
