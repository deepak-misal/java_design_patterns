package com.techlab.test;

import com.techlab.model.File;
import com.techlab.model.Folder;

public class StorageTest {
	public static void main(String[] args) {
		Folder root=new Folder("movies");
		root.addChild(new File("abc",20,"video"));
		root.addChild(new File("xyz",30,"audio"));
		root.addChild(new File("pqr",50,"mp3"));
		root.display();
		Folder root1=new Folder("comedy_movies");
		root1.addChild(new File("hse",25,"mp4"));
		root1.addChild(new File("usdh",35,"hd"));
		root1.display();
		
	}
	
}
