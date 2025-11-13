
public class WageEmployee extends Employee {
	
	private int hours;
	private int rate ;
	
	
	public WageEmployee(int hours, int rate,double basicSalary) {
		super(basicSalary);
		this.hours = hours;
		this.rate = rate;
	}
	
	
	
	public int getHours() {
		return hours;
	}



	public void setHours(int hours) {
		this.hours = hours;
	}



	public int getRate() {
		return rate;
	}



	public void setRate(int rate) {
		this.rate = rate;
	}


    @Override
	public double calculateSalary() {
		return basicSalary + this.hours*this.rate ;
	}
	
	void showDetails() {
		super.showDetails();
		System.out.println(this.hours+" | "+ this.rate);
	}
	

}
