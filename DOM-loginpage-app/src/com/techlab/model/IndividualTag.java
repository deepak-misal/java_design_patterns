package com.techlab.model;

public class IndividualTag implements IIndividual{
	private String name;
	private String content;
	private int level;
	private StringBuilder str=new StringBuilder();
	public IndividualTag(String name,String content) {
		this.name=name;
		this.content=content;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void display() {
		for(int i=0;i<level;i++) {
			str.append("    ");
		}
		str.append("<"+name+">"+content+"<"+name+"/>");
		System.out.println(str);
	}

}
