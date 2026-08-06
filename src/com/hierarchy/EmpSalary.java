package com.hierarchy;

class Employee{
	String name;
	double baseSalary;
	
	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public double  calculateAnnualSalary(){
		double anuSal=baseSalary*12;
		return anuSal;
	}
		
}

class Manager extends Employee{
	double bonous;
	int numberOfEmployeesManaged;

	public Manager(String name, double baseSalary, double bonous, int numberOfEmployeesManaged) {
		super(name, baseSalary);
		this.bonous = bonous;
		this.numberOfEmployeesManaged = numberOfEmployeesManaged;
	}

	public double  calculateManagerSalary() {
		double manSal=bonous+calculateAnnualSalary();
		return manSal;	
	}
}

class Engineer extends Employee{
	int projectCount;

	public Engineer(String name, double baseSalary, int projectCount) {
		super(name, baseSalary);
		this.projectCount = projectCount;
	}
	
	public double calculateEngineerSalary() {
		double engSal;
		if(projectCount >10) {
			engSal=calculateAnnualSalary()+(0.5*calculateAnnualSalary());					
		}
		else if(projectCount >5 && projectCount<=10) {
			engSal=calculateAnnualSalary()+(0.25*calculateAnnualSalary());					
		}
		else if(projectCount <=5) {
			engSal=calculateAnnualSalary()+(0.1*calculateAnnualSalary());					
		}
		else {
			engSal=calculateAnnualSalary();
		}
		return engSal;
	}
	
}

class Salesperson extends Employee{
	double commissionRate;
	double totalSales;
	
	public Salesperson(String name, double baseSalary, double commissionRate, double totalSales) {
		super(name, baseSalary);
		this.commissionRate = commissionRate;
		this.totalSales = totalSales;
	}
	
	public double calculateSalespersonSalary() {
		double salesSal=calculateAnnualSalary()+(totalSales*commissionRate);
		return salesSal;
	}
	
}

public class EmpSalary {

	public static void main(String[] args) {
		
		Employee manager = new Manager("Alice", 50000, 10000, 5);
		System.out.println("Manger Salary Details:");
		System.out.println(manager.calculateAnnualSalary());
		System.out.println(((Manager) manager).calculateManagerSalary());
		
		Employee engineer = new Engineer("Bob", 70000, 5);
		System.out.println("\nEngineer Salary Details:");
		System.out.println(engineer.calculateAnnualSalary()); 
		System.out.println(((Engineer) engineer).calculateEngineerSalary());
		
		Employee salesperson = new Salesperson("Charlie", 40000, 0.1, 200000); 
		System.out.println("\nSalesperson Salary Details:");
		System.out.println(salesperson.calculateAnnualSalary()); 
		System.out.println(((Salesperson) salesperson).calculateSalespersonSalary());
		

	}

}
