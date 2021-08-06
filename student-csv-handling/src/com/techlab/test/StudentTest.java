package com.techlab.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.techlab.model.AvgMinMaxCalculator;
import com.techlab.model.Student;
import com.techlab.model.StudentCsvGenerator;

public class StudentTest {
	final static String CSV_Location = "D:\\java_design_pattern\\student-csv-handling\\bin\\com\\techlab\\model\\studentdata.csv";

	public static void main(String[] args) throws IOException {
		File file = new File(CSV_Location);
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "abc", "mumbai", 7, 64));
		studentList.add(new Student(2, "xyz", "pune", 8.5, 64));
		studentList.add(new Student(3,"gdsv","gujrat",9.0,78));
		studentList.add(new Student(4,"rto","punjab",6.5,70));
		studentList.add(new Student(5,"eaf","kerla",7.5,72));
		studentList.add(new Student(6,"esrg","karnatak",8.8,86));
		studentList.add(new Student(7,"aram","goa",9.2,90));
		studentList.add(new Student(8,"kkr","kolkata",8.7,92));
		studentList.add(new Student(9,"csk","chenai",7.2,65));
		studentList.add(new Student(10,"srh","heydrabad",5.6,40));
		studentList.add(new Student(1, "abc", "mumbai", 7.0, 64));
		studentList.add(new Student(2, "xyz", "pune", 8.5, 64));
		studentList.add(new Student(3,"gdsv","gujrat",9,78));
		studentList.add(new Student(4,"rto","punjab",6.5,70));
		studentList.add(new Student(5,"eaf","kerla",7.5,72));
		
		Set<Student> s= new LinkedHashSet<Student>();
		s.addAll(studentList);
		studentList=new ArrayList<Student>();
		studentList.addAll(s);


		StudentCsvGenerator csvGenerator = new StudentCsvGenerator(studentList, file);
		csvGenerator.writeToCsv();
		
		AvgMinMaxCalculator cal=new AvgMinMaxCalculator(studentList);
		printResult(cal);
	}

	private static void printResult(AvgMinMaxCalculator cal) {
		System.out.println("Average marks:"+cal.averageGre());
		System.out.println("Average Cgpa:"+cal.averageCgpa());
		System.out.println("");
		System.out.println("Minimum Score:");
		displayStudentDetails(cal.min());
		System.out.println("Maximum Score:");
		displayStudentDetails(cal.max());
	}

	private static void displayStudentDetails(Student m) {
		System.out.println("name of student:"+m.getName());
		System.out.println("score of student:"+m.getGreScore());
		System.out.println("");
		
		
	}

}
