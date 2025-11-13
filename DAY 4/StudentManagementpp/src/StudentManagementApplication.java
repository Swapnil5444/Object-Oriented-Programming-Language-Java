import java.util.Scanner;

public class StudentManagementApplication {

	public static void main(String[] args) {
		
		System.out.println("Number od Students register are" + Student.getCount());
		
	
		
		Scanner sc = new Scanner(System.in);
		//1.create a reference of Student type
		Student s;
		System.out.println("Before");
		
		//2.create object and assign to reference variable
		s = new Student(10,"Swapnil Rathod",89.99f);
        System.out.println(s);
        
//        System.out.println(s.rollNumber);
//        System.out.println(s.name);
//        System.out.println(s.marks);
        
        //s.rollNumber=1;// to stop this we make sure rollNumber
                        //is not accessible outside the class 
                        //in which it is declared.
        //s.name="Swapnil";
        //s.marks= 98.99f;
        
        //s.accept(10,"Swapnil Rathod",99.99f);
        s.display(); // invoking display() method
        
        Student s1 = new Student(12,"Shravani Kulkarni",98.99f);
        
        //System.out.println(s1);
        
       //s1.accept(100,"Ramanuj",88.16f);
        s1.display();
        
        s.display("*");
        
        
        
	}

}
