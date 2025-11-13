package org.ycpait.studentmanagementpp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.ycpait.studentmanagement.entity.Student;
import org.ycpait.studentmanagementpp.exception.StudentNotFoundException;

public class StudentManagementApplication {

	public static void main(String[] args) {
		
		System.out.println("Number od Students register are" + Student.getCount());
		//Student s =null;
		
		//Student[] students = new Student[2];
		List<Student> students = new ArrayList<Student>();
		//System.out.println(students[0]);
		//System.out.println(students[1]);
		

		
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
			 System.out.println("4. Delete Student by Roll Number:");
			 System.out.println("5.Sort students by Marks:");
			 System.out.println("6.Sort students by Name:");
			 System.out.println("-1. Exit");
			 System.out.println("Enter your choice");
			 choice = sc.nextInt();
			 switch(choice) {
			 case 1: {

					sc.nextLine();



					System.out.print("Enter Student Name: ");

					String name = sc.nextLine();



					System.out.print("Enter Student Marks: ");

					float percent = sc.nextFloat();



					Student s = new Student(name, percent);

					students.add(s);

					System.out.println();

					System.out.println("Student registered successfully!");

					break;

				}



				case 2: {

					if (students.isEmpty()) {

						System.out.println("No students registered yet.");

					} else {

						System.out.println("\nRegistered Student Details:");

						System.out.println("============================");



						for (Student stu : students) {

							stu.display();

						}



						System.out.println("============================");

						System.out.println("Total Students: " + students.size());

					}

					break;

				}



				case 3: {

					if (students.isEmpty()) {

						System.out.println("No students registered yet.");

					} else {

						System.out.print("Enter roll number: ");

						int r = sc.nextInt();



						boolean found = false;



						for (Student st : students) {

							if (st.getRollNumber() == r) {

								System.out.println("============================");

								st.display();

								System.out.println("============================");

								found = true;

								break;

							}

						}



						if (!found) {

							try {

								System.out.println();

								throw new StudentNotFoundException("Student with roll number " + r + " is not found.");

							} catch (StudentNotFoundException ex) {

								System.out.println(ex.getMessage());

							}

						}

					}

					break;

				}



				case 4: {

					if (students.isEmpty()) {

						System.out.println("No students registered yet.");

					} else {

						System.out.print("Enter roll number: ");

						int r = sc.nextInt();

						boolean found = false;

						Iterator<Student> i;

						i = students.iterator();



						while (i.hasNext()) {

							Student st = i.next();

							if (st.getRollNumber() == r) {

								i.remove();

								found = true;

							}

						}

						if (found) {

							System.out.println();

							System.out.println("Student Deleted successfully!");

						} else {

							System.out.println("Student with roll number " + r + " is not found.");

						}

					}

					break;

				}

				case 5: {

					Collections.sort(students);

					System.out.println("\nSorted List of students:");

					System.out.println("============================");

					for (Student stu : students) {

						if (stu != null) {

							System.out.println(stu);

						}

						

					}

					break;

				}
				
				case 6:
					
					Collections.sort(students,(s1,s2) -> s1.getName().compareTo(s2.getName()));
					
					for (Student stu : students) {
						if(stu != null)
							System.out.println(stu);
					}
					break;

				case -1:

					System.out.println("Exiting...");

					break;



				default:

					System.out.println("Select a valid choice!");

				}



			} while (choice != -1);



			sc.close();

			System.out.println("Program Exit Successful.");

		}

	}