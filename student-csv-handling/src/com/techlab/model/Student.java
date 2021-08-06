package com.techlab.model;

public class Student {
	private int rollNo;
	private String name;
	private String location;
	private double cgpa;
	private double greScore;

	public Student(int rollNo, String name, String location, double cgpa, double greScore) {
		this.rollNo = rollNo;
		this.name = name;
		this.location = location;
		this.cgpa = cgpa;
		this.greScore = greScore;
	}

	public Integer getRollNO() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public Double getCgpa() {
		return cgpa;
	}

	public Double getGreScore() {
		return greScore;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Student) {
			Student temp = (Student) obj;
			if (this.name.equals(temp.name) && this.location.equals(temp.location))
				return true;
			if(this.getCgpa().equals(temp.getCgpa()) && this.getGreScore().equals(temp.getGreScore()) && this.getRollNO().equals(temp.getRollNO()))
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() {

		return (this.name.hashCode() + this.location.hashCode());
	}

}
