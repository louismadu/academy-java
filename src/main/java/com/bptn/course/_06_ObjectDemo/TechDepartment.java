package com.bptn.course._06_ObjectDemo;

class TechDepartment extends Department{
	private double purchaseAmount;
	
	public TechDepartment (String departmentName, int numberOfEmployees, double purchaseAmount) {
		super(departmentName, numberOfEmployees);
		this.purchaseAmount = purchaseAmount;
	}
}
