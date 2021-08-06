package com.techlab.test;


import java.io.FileReader;
import java.io.IOException;

import java.util.Properties;


import com.techlab.model.IAuto;
import com.techlab.model.IAutoFactory;

public class Test {
	public static Class concreteClass;
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		 FileReader reader=new FileReader("D:\\java_design_pattern\\factory-method-ocp-patter-app\\bin\\resource\\factory.properties");  
		 Properties p=new Properties();  
		 p.load(reader); 
		 String classname=p.getProperty("currentfactory");
		 concreteClass=Class.forName(classname);
		 IAutoFactory factory=(IAutoFactory)concreteClass.newInstance();
		 IAuto bmw=factory.make();
		 bmw.getName();
		 bmw.start();
		 bmw.stop();
		 System.out.println(factory.hashCode());
		
	}


}


