package com.techlab.model;

public class AlarmChecker extends HomeSecurityChecker{

	@Override
	public void check(HomeStatusDTO dto) throws Exception {
		System.out.println("chekcing alarm");
		if(!dto.alarmOn) {
			throw new Exception("Alarm is off");
		}
		else {
			this.checkNext(dto);
		}
	}

}
