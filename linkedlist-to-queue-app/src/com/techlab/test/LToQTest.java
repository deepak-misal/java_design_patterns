package com.techlab.test;

import java.util.LinkedList;

import com.techlab.model.LLToQueueAdapter;

public class LToQTest {

	public static <T> void main(String[] args) {
		LinkedList<T> linkedlist=new LinkedList<>();
		LLToQueueAdapter<T> queue=new LLToQueueAdapter<T>(linkedlist);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.dequeue();		
		
		for(T object:linkedlist) {
			System.out.println(object);
		}
	}

}
