package com.techlab.test;

import com.techlab.model.GroupTag;
import com.techlab.model.IndividualTag;

public class DOMTest {

	public static void main(String[] args) {
		GroupTag form=new GroupTag("form",0);
		form.addSubTag(new IndividualTag("p","hello"));
		GroupTag div=new GroupTag("div",1);
		div.addSubTag(new IndividualTag("input","username"));
		div.addSubTag(new IndividualTag("label","username"));
		div.addSubTag(new IndividualTag("input","password"));
		div.addSubTag(new IndividualTag("label","password"));
		div.addSubTag(new IndividualTag("button","submit"));
		form.addSubTag(div);
		form.addSubTag(new IndividualTag("p","bye"));
		form.display();
	}

}
