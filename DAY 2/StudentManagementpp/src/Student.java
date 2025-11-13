
public class Student {
	
	private static int count;
	
	
	//attributes OR instances 
	private int rollNumber;
	private String name;
	private float marks;

//	//no-arg constructor
//	public Student(){
//		System.out.println("Inside Student()");
//		this.rollNumber=10;
//		this.name="Shreyas Revankar";
//		this.marks=89.98f;
//	}
	
	//Parameterized Constructor
	public Student(int rollNumber,String name,float marks) {
		System.out.println("================Parameterized Constructor==============");
		count++;
		this.rollNumber=count;
		this.name=name;
		this.marks=marks;
	}
	
	public static int getCount() {
		return count;
	}
	
	void accept(int rollNumber,String name,float marks) {
		this.rollNumber=rollNumber;
		this.name=name;
		this.marks=marks;
	}
	
	//It is a method
	void display() {
		  System.out.println(this.rollNumber); // this line is equivalent to this rollnumber ,
		                                       //it is recommended to use explicitly this reference inside the reference
		                                       //it makes code readable
          System.out.println(this.name);
	      System.out.println(this.marks);
	}
	
	void display(String format) {
		
		System.out.println("Roll Number   \t    Name     \t   Marks");
		for(int i =1;i<=40;i++)
			System.out.print(format);
		
		System.out.println();//for new line
		System.out.println(this.rollNumber + "\t" + this.name + "\t" +this.marks);
	}
}

