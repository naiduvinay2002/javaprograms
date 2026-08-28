package com.oopsTask;

public class StaffMember extends Employee{
	private String designation;
	private double overTimeHours;
	
	public StaffMember(String employeeId, String name, String designation, double overTimeHours) {
		super(employeeId, name);
		this.designation = designation;
		this.overTimeHours = overTimeHours;
	}

	public String getDesignation() {
		return designation;
	}

	public double getOverTimeHours() {
		return overTimeHours;
	}

	@Override
	public double calculateSalary(double baseSalary) {
		double msalary=baseSalary+(25*getOverTimeHours());
		return msalary;
	}

	@Override
	public void displayDetails() {

		printBasicInfo();
		System.out.println("Designation: "+designation);
		System.out.println("Overtime Hours: "+overTimeHours);
	}
}
