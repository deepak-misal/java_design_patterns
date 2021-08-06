package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class GroupTag implements IGroup,IIndividual{
	private String name;
	private List<IIndividual> subTags;
	public int level;
	private StringBuilder str = new StringBuilder();
	
	public GroupTag(String name,int level) {
		this.name=name;
		subTags=new ArrayList<IIndividual>();
		this.level=level;
	}
	public int getLevel() {
		return level;
	}
	
	
	public void addSubTag(IIndividual subTag) {
		subTag.setLevel(this.level+1);    
		subTags.add(subTag);
	}
	

	@Override
	public void display() {
		for(int i=0;i<this.level;i++) {
			str.append("    ");
		}
		System.out.println(str+"<"+name+">");
			
		for(IIndividual subTag : subTags) {
			subTag.display();
		}
		System.out.println(str+"</"+name+">");
		
	}
	public void setLevel(int level) {
		this.level=level;
		
	}
	

}
