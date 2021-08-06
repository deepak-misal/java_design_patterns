package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCalculator {
	List<Employee> empList = new ArrayList<Employee>();
	
	public EmployeeCalculator(List<Employee> empList) {
		this.empList=empList;
	}
	
	public Employee getMaxSalaryEmp()
	{
		int maxSalaryEmp=empList.get(0).getSalary();
		Employee maxEmp=null;
		for(Employee e : empList)
		{
			if (maxSalaryEmp<e.getSalary())
			{
				maxSalaryEmp=e.getSalary();
				maxEmp=e;
			}
			//System.out.println(e.getEmpId()+" "+e.getEmpName()+" " +e.getEmpDesignation()+" "+e.getEmpId()+" "+e.getDateOfJoining()+" "+e.getSalary()+" "+e.getCommission()+" "+e.getDepNo());
		}

		return maxEmp;
	}
	
	
	public int getTotal()
	{
		int count=0;
		for(Employee e : empList)
		{
			count++;			
		}

		return count;
	}

}
