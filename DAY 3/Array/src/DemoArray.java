
public class DemoArray {

	public static void main(String[] args) {
		
		//If we don't pass values to this array an exception is generated
		System.out.println(args[0]);
		
		int[] numbers;
		
		numbers = new int[3];
		
		numbers[0] =10;
		numbers[1] =20;
		numbers[2] =30;
		//numbers[3] =40; //Exception
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		//WAY-2
		
		float[] marks = new float[2];
		
		marks[0]=88.89f;
		marks[1]=78.67f;
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		
		//WAY-3
		String[] subjects = {"Java","Spring"};
		System.out.println(subjects[0]);
		System.out.println(subjects[1]);
		
		//basic for loop
		for(int i=0;i< subjects.length;i++) {
			System.out.println(subjects[i]);
		}
		
		//enhanced for loop OR for-in loop
		//added in jdk 5
		
		//Syntax as follows:- for(data_type variable: array_name);
		
		for(String s: subjects) {
			System.out.println(s);
		}
	}

}
