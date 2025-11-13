
public class Employee {
        
	public static int count;
	
		private int id;
		private String Name;
		private double basicSalary;
		
		void Display() {
			System.out.println(this.id+" | "+this.Name+" | "+this.basicSalary);
		}
		
		public double calculateSalary() {
			return basicSalary + 2500;
		}
		
		public Employee(String Name,double basicSalary) {
			
			count++;
			this.id=count;
			this.Name=Name;
			this.basicSalary=basicSalary;
		}

}
