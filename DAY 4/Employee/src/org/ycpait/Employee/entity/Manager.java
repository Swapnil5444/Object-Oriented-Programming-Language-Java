package org.ycpait.Employee.entity;

public class Manager extends Employee{
	
	private int incentives;

	public Manager(int incentives, double basicSalary) {
		super(basicSalary);
		this.incentives = incentives;
	}

	public int getIncentives() {
		return incentives;
	}

	public void setIncentives(int incentives) {
		this.incentives = incentives;
	}
	
	@Override
	public double calculateSalary() {
		return basicSalary+this.incentives;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println(this.incentives);
	}

}
