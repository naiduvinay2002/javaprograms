package com.dashboard;

import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID : ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name : ");
        String empName = sc.nextLine();

        System.out.print("Enter Basic Salary : ");
        double basicSalary = sc.nextDouble();

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double grossSalary = basicSalary + hra + da;

        System.out.println("\nEmployee Details");
        System.out.println("----------------");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("Gross Salary  : " + grossSalary);

        sc.close();
    }
}
