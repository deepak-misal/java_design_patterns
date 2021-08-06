package com.techlab.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeCsvReader {
	
	String fileName;
	BufferedReader br = null;
	List<Employee> empList = new ArrayList<Employee>();
	
	public EmployeeCsvReader(String fileName){
		this.fileName=fileName;
	}
	
	public List<Employee> objectAssigner() {
		try
		{
			br = new BufferedReader(new FileReader(fileName));

			String line = "";

			while ((line = br.readLine()) != null) 
			{
				String[] employeeDetails = line.split(",");

				if(employeeDetails.length > 0 )
				{
					//Save the employee details in Employee object
					Employee emp = new Employee(Integer.parseInt(employeeDetails[0]),employeeDetails[1],employeeDetails[2],Integer.parseInt(employeeDetails[3]), employeeDetails[4],Integer.parseInt(employeeDetails[5]),Integer.parseInt(employeeDetails[6]),Integer.parseInt(employeeDetails[7]));
					empList.add(emp);
				}
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}
			catch(IOException ie)
			{
				System.out.println("Error occured while closing the BufferedReader");
				ie.printStackTrace();
			}
		}
		return empList;		
	}

}
