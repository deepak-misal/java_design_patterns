package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements StorageItem{
	private String name;
	List<StorageItem> children=new ArrayList<StorageItem>();
	public Folder(String name) {
		this.name=name;
	}
	public void addChild(StorageItem item) {
		children.add(item);
	}

	@Override
	public void display() {
		System.out.println("folder name:"+name);
		for(StorageItem item:children) {
			System.out.println(item);
		}
	}

}
