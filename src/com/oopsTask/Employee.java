package com.oopsTask;

public abstract class Employee {
	private String employeeId;
	private String name;
	
	public Employee(String employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}
	
	public abstract double calculateSalary(double baseSalary);
	public abstract void displayDetails();
	
	public void printBasicInfo() {
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+name);
	}
	
	

}
