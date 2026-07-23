package com.tasks;

public class Employee {
	private int empid;
	private String name;
	private String designation;
	private double salary;
	private int performanceRating;
	
	public Employee(int empid, String name, String designation, double salary, int performanceRating) {
		super();
		this.empid = empid;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.performanceRating = performanceRating;
		System.out.println("Employee ID: "+empid);
		System.out.println("Employee Name: "+name);
		System.out.println("Current Designation: "+designation);
		System.out.println("Employee Salary: $"+salary);
		System.out.println("Employee Performance Rating: "+performanceRating);
	}

	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public int getPerformanceRating() {
		return performanceRating;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void promoteEmployee() {
		if(performanceRating>=4) {
			salary+=salary*(20%100);
			designation="Senior Developer";
			System.out.println();
			System.out.println("After Promotion");
			System.out.println("New Designation: "+designation);
			System.out.println("Updated Salary: $"+salary);
		}
		else {
			System.out.println();
			System.out.println("Designation and salary remain unchanged.");
		}
		
	}
	
}
