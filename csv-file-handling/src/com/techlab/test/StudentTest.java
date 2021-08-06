package com.techlab.test;
import au.com.bytecode.opencsv.CSVReader;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.techlab.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> csvData = createCsvDataSimple();

        // default all fields are enclosed in double quotes
        // default separator is a comma
        try (CSVWriter writer = new CSVWriter(new FileWriter("D:\\java_design_pattern\\csv-file-handling\\bin\\com\\techlab\\model\student_data.csv"))) {
            writer.writeAll(csvData);
        }


	}

	private static List<Student> createCsvDataSimple() {
		String[] header = {"roll no", "name", "location", "cgpa","ger score"};
        Student record1=new Student(1,"abc","mumbai",7,32);
        Student record2=new Student(2,"xyz","mumbai",8,34);
        
        

        List<Student> list = new ArrayList<>();
        list.add(record1);
        list.add(record2);

        return list;
	}

}
