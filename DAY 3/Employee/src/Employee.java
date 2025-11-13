
public class Employee {
	protected double basicSalary;
	
	
	void showDetails() {
		System.out.println(this.basicSalary);
	}
	
	public double calculateSalary() {
		return this.basicSalary + 2500;
	}
	
	public Employee(double basicSalary) {
		this.basicSalary = basicSalary;
	}

}
