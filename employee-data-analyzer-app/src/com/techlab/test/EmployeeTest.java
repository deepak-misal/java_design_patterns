package com.techlab.test;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlab.model.Employee;
import com.techlab.model.EmployeeCalculator;
import com.techlab.model.EmployeeCsvReader;
import com.techlab.model.FileOperator;

public class EmployeeTest {

	public static void main(String[] args) throws IOException {
		List<Employee> empList=new ArrayList<Employee>();
		List<Employee> urlEmpList=new ArrayList<Employee>();
		

		String fileName = "D:\\java_design_pattern\\employee-data-analyzer-app\\bin\\empdata.csv";
		String copyFileName = "D:\\java_design_pattern\\employee-data-analyzer-app\\bin\\copyEmp.csv";
		File originalFile=new File(fileName);
		File copyFile=new File(copyFileName);
		
		FileOperator uniqueElementFile= new FileOperator(originalFile,copyFile);
		File uniqueFile=uniqueElementFile.getUniqueElementFile();
		String uniqueFilePath=uniqueFile.getAbsolutePath();
		
		EmployeeCsvReader empParser=new EmployeeCsvReader(uniqueFilePath);
		empList=empParser.objectAssigner();
		
		EmployeeCalculator empCal=new EmployeeCalculator(empList);
		Employee maxSalaryEmp=empCal.getMaxSalaryEmp();
		
		System.out.println("MAXIMUM SALARIED EMPLOYEE DETAILS:");
		printEmployeeDetails(maxSalaryEmp);
		
		int totalEmployee=empCal.getTotal();
		System.out.println("TOTAL NUMBER OF EMPLYOEES:"+totalEmployee);
		
		//URL url=new URL("https://swabhav-tech.firebaseapp.com/emp.txt"); 
		//System.out.println("File Name: "+url.getFile());
		
		String fileName1 = "D:\\java_design_pattern\\employee-data-analyzer-app\\bin\\dataFile.csv";

	    URL url=new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
	    Scanner s1=new Scanner(url.openStream());

	    FileWriter fw=new FileWriter(fileName1);
	    while(s1.hasNext())
	    {
	      String line=s1.next();
	      fw.write(line);
	      fw.write("\n");

	    }
	    fw.close();
	    
	    File urlFile=new File(fileName1);
	    File urlCopyFile=new File("D:\\java_design_pattern\\employee-data-analyzer-app\\bin\\urlcopy.csv");
	    
	    FileOperator urlUniqueElementFile= new FileOperator(urlFile,urlCopyFile);
		File urlUniqueFile=urlUniqueElementFile.getUniqueElementFile();
		String urlUniqueFilePath=urlUniqueFile.getAbsolutePath();
		
		EmployeeCsvReader urlEmpParser=new EmployeeCsvReader(urlUniqueFilePath);
		urlEmpList=urlEmpParser.objectAssigner();
		
		EmployeeCalculator urlEmpCal=new EmployeeCalculator(urlEmpList);
		Employee maxSalaryEmp1=urlEmpCal.getMaxSalaryEmp();
		
		System.out.println("MAXIMUM SALARIED EMPLOYEE DETAILS BY URL:");
		printEmployeeDetails(maxSalaryEmp1);
		
		int totalEmployee1=urlEmpCal.getTotal();
		System.out.println("TOTAL NUMBER OF EMPLYOEES BY URL:"+totalEmployee1);
	    
		 
		
	}

	private static void printEmployeeDetails(Employee emp) {
		
		System.out.println("Employee ID:"+emp.getEmpId());
		System.out.println("Employee Name:"+emp.getEmpName());
		System.out.println("Employee Designation:"+emp.getEmpDesignation());
		System.out.println("Employee Salary:"+emp.getSalary());
		System.out.println("");
		
	}
}


