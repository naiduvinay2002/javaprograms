package com.dashboard;

public class Employee {
	int employeeId;
	String employeeName;
	int salary;
	
	public void setEmployeeDetails(int employeeId,String employeeName,int salary) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee DEtails");
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Salary: "+salary);
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmployeeDetails(1001, "Ravi", 45000);
		e.displayEmployeeDetails();
	}

}
