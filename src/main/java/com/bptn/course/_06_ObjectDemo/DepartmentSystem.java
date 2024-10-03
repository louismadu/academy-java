package com.bptn.course._06_ObjectDemo;

public class DepartmentSystem {
	
	public static void main(String[] args) {
		SalesDepartment theSalesDepartment = new SalesDepartment("Sales", 30, 20);
		theSalesDepartment.showDepartmentInfo();
		

	
		SalesDepartment theTechDepartment = new TechDepartment("Tech", 5, 20.00);
		theTechDepartment.showDepartmentInfo();	
	
	}
}
