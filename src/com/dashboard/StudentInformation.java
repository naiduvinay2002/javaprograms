package com.dashboard;

import java.util.Scanner;

public class StudentInformation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student ID : ");
		int studentId=sc.nextInt();
		System.out.print("Enter Student Name : ");
		String studentName=sc.next();
		System.out.print("Enter Age : ");
		int age=sc.nextInt();
		System.out.print("Enter Course : ");
		String course = sc.next();
		
		System.out.println("\nStudent Details");
		System.out.println("---------------");
		System.out.println("Student ID   : "+studentId);
		System.out.println("Student Name : "+studentName);
		System.out.println("Age          : "+age);
		System.out.println("Course       : "+course);
		
		sc.close();
		
	}

}
