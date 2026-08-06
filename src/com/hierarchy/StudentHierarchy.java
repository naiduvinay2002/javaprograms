package com.hierarchy;

class Student{
	String name;
	int studentId;
	
	public Student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student Name: "+name);
		System.out.println("Student ID: "+studentId);
	}
}

class Undergraduate extends Student {
	String major;
	
	public Undergraduate(String name, int studentId, String major) {
		super(name, studentId);
		this.major = major;
	}

	public void displayUndergraduateInfo() {
		System.out.println("Major: "+major+"\n");
	} 
}

class Graduate extends Student{

	String thesisTopic;

	public Graduate(String name, int studentId, String thesisTopic) {
		super(name, studentId);
		this.thesisTopic = thesisTopic;
	}
	
	public void displayGraduateInfo() {
		System.out.println("Thesis Topic: "+thesisTopic+"\n");
	}
}

class PhDStudent extends Student{
	String researchArea;

	public PhDStudent(String name, int studentId, String researchArea) {
		super(name, studentId);
		this.researchArea = researchArea;
	}
	
	public void displayPhDStudentInfo() {
		System.out.println("Research Area: "+researchArea+"\n");
		
	}
	
}
public class StudentHierarchy {

	public static void main(String[] args) {
		
		Student undergraduate = new Undergraduate("Alice", 12345, "Computer Science"); 
		undergraduate.displayStudentInfo(); 
		((Undergraduate) undergraduate).displayUndergraduateInfo();
		
		Student graduate = new Graduate("Bob", 67890, "Machine Learning"); 
		graduate.displayStudentInfo();  
		((Graduate) graduate).displayGraduateInfo();
		
		Student phdStudent = new PhDStudent("Charlie", 11223 , "Artificial Intelligence"); 
		phdStudent.displayStudentInfo(); // Calls the method from the base class 
		((PhDStudent) phdStudent).displayPhDStudentInfo();

	}

}
