package com.oopsTask;

public class FacultyMember extends Employee  {
	private int departmentCode;
	private int yearsOfService;
	
	public FacultyMember(String employeeId, String name, int departmentCode, int yearsOfService) {
		super(employeeId, name);
		this.departmentCode = departmentCode;
		this.yearsOfService = yearsOfService;
	}

	public int getDepartmentCode() {
		return departmentCode;
	}

	public int getYearsOfService() {
		return yearsOfService;
	}

	@Override
	public double calculateSalary(double baseSalary) {
		double msalary=baseSalary+(1000*getYearsOfService());
		return msalary;
	}

	@Override
	public void displayDetails() {
		printBasicInfo();
		System.out.println("Department Code: "+departmentCode);
		System.out.println("Years Of Experience: "+yearsOfService);
		
	}
	
}
