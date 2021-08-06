package com.techlab.model;


public class DataService {
	private static DataService bucket;
	private DataService() {
		System.out.println("object is created"+this.hashCode());
	}
	public void doSomething() {
		System.out.println("work done by"+this.hashCode());
	}
	
	public static DataService getInstance()  {
		
		if(bucket==null)
			if(bucket==null)
				bucket=new DataService();
		return bucket;
	}
	/*
	public static DataService getInstance()  {
			
			if(bucket==null)
				synchronized(DataService.class) {
					if(bucket==null)
						bucket=new DataService();
				}
			return bucket;
	}*/
		

}