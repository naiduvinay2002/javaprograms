package com.tasks;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee Details");
		int empid = s.nextInt();
		String name =s.next();
		String designation=s.next();
		double salary=s.nextDouble();
		int performanceRating = s.nextInt();
		Employee e=new Employee(empid,name,designation,salary,performanceRating);
		System.out.println("=====Employee Details=====");
		System.out.println("Employee ID: "+empid);
		System.out.println("Employee Name: "+name);
		System.out.println("Current Designation: "+designation);
		System.out.println("Employee Salary: $"+salary);
		System.out.println("Employee Performance Rating: "+performanceRating);
		e.promoteEmployee("Senior Trainee");
		
		s.close();
	}

}
