package com.techlab.model;

public abstract class Handler {
	private Handler next;
	public void setNext(Handler next) {
		this.next=next;
	}
	public abstract void check(HttpRequestDTO dto) throws Exception;
	protected void checkNext(HttpRequestDTO dto) throws Exception {
		if(next!=null) {
			next.check(dto);
		}
	}

}
