package com.techlab.model;

public class File implements StorageItem{
	private String name;
	private int size;
	private String type;
	public File(String name,int size,String type) {
		this.name=name;
		this.size=size;
		this.type=type;
	}

	@Override
	public void display() {
		System.out.println("file name:"+name);
		
	}
	public String toString() {
		return("name:"+name+" size:"+size+" type:"+type);
	}
	
}
