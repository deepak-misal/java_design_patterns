package com.techlab.model;

public class Node <T>{
	private String data;
	private Node<T> next;
	public Node(String data) {
		this.data=data;
		this.next=null;
	}
	public Node<T> getNext(){
		return next;
	}
	public String getData(){
		return data;
	}
	public void setNext(Node<T> next) {
		this.next=next;
	}
	public boolean checkNext() {
		if(next!=null) {
			return true;
		}
		return false;
	}

}
