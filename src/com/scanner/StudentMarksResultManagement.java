package com.scanner;

import java.util.Scanner;

public class StudentMarksResultManagement {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Student Name: ");
		String name=sc.next();
		System.out.println("Student ID: ");
		int id =sc.nextInt();
		System.out.println("Course Name: ");
		String course=sc.next();
		sc.nextLine();
		System.out.println("First Subject Marks: ");
		double marks = sc.nextDouble();
		
		StudentResult s = new StudentResult(name, id, course, marks);
		int option = 0;
		while (option != 4) {
            System.out.println("\n===== Student Result Menu =====");
            System.out.println("1. Add more subject marks");
            System.out.println("2. Calculate grade");
            System.out.println("3. View total marks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            if (option == 1) {
                System.out.print("Enter Subject Marks: ");
                double newMarks = sc.nextDouble();
                s.addMarks(newMarks);

            } else if (option == 2) {
                s.calculateGrade();

            } else if (option == 3) {
                s.viewTotalMarks();

            } else if (option == 4) {
                System.out.println("Thank You! Result Processing Completed.");

            } else {
                System.out.println("Invalid option");
            }
        }
		sc.close();
	}

}
