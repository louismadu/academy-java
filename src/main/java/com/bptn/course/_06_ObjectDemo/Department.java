package com.bptn.course._06_ObjectDemo;

class Department {
	private String departmentName;
	private int numberOfEmployees;
	
	public Department(String departmentName, int numberOfEmployees) {
		this.departmentName = departmentName;
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public void showDepartmentInfo() {
		System.out.println("Department Name: "+ departmentName);
		System.out.println("Number Of Employees: "+ numberOfEmployees);
	}

}
