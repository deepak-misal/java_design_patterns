package com.techlab.model;

public class Employee {
	private int empId,manId,salary,commission,depNo;
	private String empName,empDesignation,dateOfJoining;

	public Employee(int empId, String empName, String empDesignation, int manId, String dateOfJoining, int salary,
			int commission,int depNo) {
		this.empId=empId;
		this.empName=empName;
		this.empDesignation=empDesignation;
		this.manId=manId;
		this.dateOfJoining=dateOfJoining;
		this.salary=salary;
		this.commission=commission;
		this.depNo=depNo;

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public int getManId() {
		return manId;
	}

	public void setManId(int manId) {
		this.manId = manId;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDOJ(String dateOfJoining) {
		dateOfJoining = dateOfJoining;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int getDepNo() {
		return depNo;
	}

	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}
}
