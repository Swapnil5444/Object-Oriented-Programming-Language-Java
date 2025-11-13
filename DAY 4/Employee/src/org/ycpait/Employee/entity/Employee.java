package org.ycpait.Employee.entity;


public abstract class Employee {
	protected double basicSalary;
	
	
	public void showDetails() {
		System.out.println(this.basicSalary);
	}
	
	public abstract double calculateSalary() ;
	
	public Employee(double basicSalary) {
		this.basicSalary = basicSalary;
	}

}
