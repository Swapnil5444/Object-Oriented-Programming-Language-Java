package org.ycpait.studentmanagementpp;

import java.util.Scanner;

import org.ycpait.studentmanagement.entity.Student;
import org.ycpait.studentmanagementpp.exception.StudentNotFoundException;

public class StudentManagementApplication {

	public static void main(String[] args) {
		
		System.out.println("Number od Students register are" + Student.getCount());
		Student s =null;
		
		Student[] students = new Student[2];
		System.out.println(students[0]);
		System.out.println(students[1]);
		

		
		Student stud1 = null;
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		int indexCount = 0;
		do {
			 System.out.println("Welcome to Student Management System");
			 System.out.println("======================================");
			 System.out.println("1. Register New Student");
			 System.out.println("2. Display Details");
			 System.out.println("3.Search Student By Roll Number:");
			 System.out.println("-1. Exit");
			 System.out.println("Enter your choice");
			 choice = sc.nextInt();
			 switch(choice) {
			 	case 1: 
			 		System.out.println(indexCount);
			 		if(indexCount <= students.length) {
			 		       students[indexCount] = new Student(1,"Amit",78.8f);
			 		       indexCount++;
			 		}
			 		else
			 		{
			 			System.err.println("Limit Exceeded");
			 		}
			 	    break;
			 	case 2:
			 		for(Student stu :students) {
			 		if(stud1!=null);
			 		break;
			 		}
			 	case 3:
			 		System.out.println("Enter Roll Number");
			 		int r = sc.nextInt();
			 		boolean isFound = false;
			 		for(Student foundStudent : students) {
			 			if(foundStudent != null) {
			 				if(foundStudent.getRollNumber() == r)	{
			 					System.out.println(foundStudent);
			 					isFound = true;
			 					break;
			 				}
			 			}
			 		}
			 		if(!isFound) {
			 			//generate Exception
			 			StudentNotFoundException e = new StudentNotFoundException("Student with rollNumber" + r +"NOT FOUND");
			 			try {
			 				throw e;
			 			}
			 			catch(StudentNotFoundException ex) {
			 				System.out.println("Student Not Found");
			 				ex.printStackTrace();
			 			}
			 		}
			 	case -1:
			 		System.out.println("Thank You visit again!!!!!!");
			 }
		}while(choice!=-1);
	}
		
		
		//1.create a reference of Student type
		//System.out.println("Before");
		
		//2.create object and assign to reference variable
		//s = new Student(10,"Swapnil Rathod",89.99f);
        //System.out.println(s);
        
//        System.out.println(s.rollNumber);
//        System.out.println(s.name);
//        System.out.println(s.marks);
        
        //s.rollNumber=1;// to stop this we make sure rollNumber
                        //is not accessible outside the class 
                        //in which it is declared.
        //s.name="Swapnil";
        //s.marks= 98.99f;
        
        //s.accept(10,"Swapnil Rathod",99.99f);
        //s.display(); // invoking display() method
        
        Student s1 = new Student(12,"Shravani Kulkarni",98.99f);
        
        //System.out.println(s1);
        
       //s1.accept(100,"Ramanuj",88.16f);
        //s1.display();
        
       // s.display("*");
        
        
        
	}
