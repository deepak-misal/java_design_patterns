package com.techlab.model;

import java.util.LinkedList;

public class LLToQueueAdapter<E> implements IQueue{
	LinkedList<Integer> list=new LinkedList<Integer>();;
	
	public LLToQueueAdapter(LinkedList<E> linkedlist) {
		this.list=(LinkedList<Integer>) linkedlist;
	}
	
	public int size() {
		return list.size();
	}

	@Override
	public void enqueue(int val) {
		list.addLast(val);
	}

	@Override
	public int dequeue() {
		if(size()==0) {
			System.out.println("Queue underflow");
			return -1;
		}else {
			return list.removeFirst();
		}
	}

}
