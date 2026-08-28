package com.oopsTask;

public class UniversityMangementSystem {

	public static void main(String[] args) {

		FacultyMember fm = new FacultyMember("F001", "Smith", 101, 5);
		StaffMember sm = new StaffMember("S001", "John", "Administrator", 20.0);
		System.out.println("====Employee Details====");
		fm.displayDetails();
		System.out.println("Monthly Salary: "+fm.calculateSalary(50000));
		
		System.out.println();
		System.out.println("====Employee Details====");
		sm.displayDetails();
		System.out.println("Monthly Salary: "+sm.calculateSalary(40000));

	}

}
