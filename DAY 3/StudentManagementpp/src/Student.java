
public class Student {
	
	private static int count;
	
	
	//attributes OR instances 
	private int rollNumber;
	private String name;
	private float marks;
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	//no-arg constructor
	public Student(){
		System.out.println("Inside Student()");
		this.rollNumber=10;
		this.name="Shreyas Revankar";
		this.marks=89.98f;
	}
	
	//Parameterized Constructor
	public Student(int rollNumber,String name,float marks) {
		System.out.println("================Parameterized Constructor==============");
		count++;
		this.rollNumber=count;
		this.name=name;
		this.marks=marks;
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
	
	@Override
    //overridden method
    //this method should return String which is useful information about this object
    
    public String  toString() {
    	System.out.println("In toString");
    	return this.rollNumber + " " + this.name + " "+ this.marks;
    }
}

