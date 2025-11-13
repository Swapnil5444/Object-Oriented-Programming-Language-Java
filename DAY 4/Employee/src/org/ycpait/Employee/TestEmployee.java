package org.ycpait.Employee;

import org.ycpait.Employee.entity.Employee;
import org.ycpait.Employee.entity.Manager;
import org.ycpait.Employee.entity.WageEmployee;

public class TestEmployee {

	public static void main(String[] args) {
		
		WageEmployee w1 = new WageEmployee(12,60,5000);
		w1.showDetails();
		
		System.out.println("Net Salary: "+w1.calculateSalary());
		
		Manager m1 = new Manager(60,5000);
		m1.showDetails();
		
		System.out.println("Net Salary: "+m1.calculateSalary());


	}

}
