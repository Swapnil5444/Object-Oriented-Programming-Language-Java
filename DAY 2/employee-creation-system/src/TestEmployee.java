import java.util.Scanner;
public class TestEmployee {

	public static void main(String[] args) {
//		Employee e1 =new Employee("Asif Shaikh",45000);
//		e1.Display();
//		e1.calculateSalary();
//		
//		System.out.println(e1.calculateSalary());
//		
//		Employee e2 =new Employee("Salim Khan",60000);
//		e2.Display();
//		e2.calculateSalary();
//		
//		System.out.println(e2.calculateSalary());
		
		Employee e1 =null;
		//built-in class used to accept I/P from user.
		Scanner sc = new Scanner(System.in);
		int choice=1;
		do {
		System.out.println("Welcome to Employee Management System");
		System.out.println("***********************************");
		System.out.println("1.Register new Employee");
		System.out.println("2.Display Details");
		System.out.println("3. Exit");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		switch(choice) {
		
		case 1:
			 e1 = new Employee("Swapnil",25000);
			break;
		case 2:
			if(e1 != null)
				e1.Display();
			break;
		case 3:
			System.out.println("Exit Successfully");
			break;
		default:
			System.out.println("Thank you see you soon");
			break;
		}
		
	 }while(choice!=-1);

 }
}
