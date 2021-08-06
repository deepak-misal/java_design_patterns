package com.techlab.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentCsvGenerator {
	private List<Student> distinctStudents = new ArrayList<Student>();
	private File file;

	public StudentCsvGenerator(List<Student> distinctStudents, File file) {
		this.distinctStudents = distinctStudents;
		this.file = file;
	}

	public void writeToCsv() throws IOException {
		FileWriter writer=null;
		try {
			 writer=new FileWriter(file);
			
			String heading="Roll NO, Name, Location, Cgpa, Gre Score";
			writer.append(heading);
			
			writer.write("\n");
			
			for(Student s: distinctStudents) {
				writer.write(s.getRollNO()+",");
				writer.write(s.getName()+",");
				writer.write(s.getLocation()+",");
				writer.write((double) s.getCgpa()+",");
				writer.write((double) s.getGreScore()+",");
				writer.write("\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				writer.flush();
				writer.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Student> getDistinctStudents() {
		return distinctStudents;
	}

}
