package com.scanner;

public class StudentResult {
	String studentName;
	int studentId;
	String courseName;
	double totalMarks;
	
	
	public StudentResult(String studentName, int studentId, String courseName, double totalMarks) {
		
		this.studentName = studentName;
		this.studentId = studentId;
		this.courseName = courseName;
		this.totalMarks = totalMarks;
		System.out.println("Student Record Created Successfully ");
		
	}
	
	public void addMarks(double marks) {
		if(marks<=0) {
			System.out.println("Invalid Marks Entered");
		}
		else {
			totalMarks+=marks;
			System.out.println("Marks Added and Updated marks are: "+totalMarks);
		}

	}
	
	public void calculateGrade() {
		if(totalMarks<=0) {
			System.out.println("No marks available to calculate grade");
		}
		else if(totalMarks>=90) {
			System.out.println("Grade A");
		}
		else if(totalMarks>=80 && totalMarks<=89) {
			System.out.println("Grade B");
		}
		else if(totalMarks>=70 && totalMarks<=79) {
			System.out.println("Grade C");
		}
		else if(totalMarks>=60 && totalMarks<=69) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}
		
	}
	
	public void viewTotalMarks() {
		System.out.println("Total Marks : "+totalMarks);
	}
	
}
