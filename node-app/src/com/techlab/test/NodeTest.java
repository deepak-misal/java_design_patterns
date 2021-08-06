package com.techlab.test;

import com.techlab.model.Node;

public class NodeTest {

	public static <T> void main(String[] args) {
		Node<String> node1=new Node<String>("Deepak");
		Node<String> node2=new Node<String>("Swabhav Techlabs");
		Node<String> node3=new Node<String>("Aurionpro Solution PVT. LTD.");
		
		node1.setNext(node2);
		node2.setNext(node3);
		
		displayNode(node1);
		displayNode(node2);
		displayNode(node3);

	}

	private static <T> void displayNode(Node<T> node) {
		
		while(node.checkNext())
		{
			System.out.println(node.getData());
			if(node.checkNext()) {
				node=node.getNext();
				continue;
			}
		}
		System.out.println(node.getData());
		System.out.println();
		
	}

}
