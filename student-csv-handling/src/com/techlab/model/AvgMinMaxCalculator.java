package com.techlab.model;

import java.util.List;

public class AvgMinMaxCalculator {
	private List<Student> studentList;
	public AvgMinMaxCalculator(List<Student> studentList) {
		this.studentList=studentList;
	}
	
	public float averageGre() {
		float sum=0;
		for(Student student:studentList) {
			sum+=student.getGreScore();
		}
		return sum/studentList.size();
	}
	public float averageCgpa() {
		float sum=0;
		for(Student student:studentList) {
			sum+=student.getCgpa();
		}
		return sum/studentList.size();
	}
	public Student min() {
		double min=Double.MAX_VALUE;
		Student minScore=null;
		for(Student student:studentList) {
			if(student.getGreScore()<min) {
				min=student.getGreScore();
				minScore=student;
			}
		}
		return minScore;
	}
	public Student max() {
		double max=Double.MIN_VALUE;
		Student maxScore=null;
		for(Student student:studentList) {
			if(student.getGreScore()>max) {
				max=student.getGreScore();
				maxScore=student;
			}
		}
		return maxScore;
	}
}
