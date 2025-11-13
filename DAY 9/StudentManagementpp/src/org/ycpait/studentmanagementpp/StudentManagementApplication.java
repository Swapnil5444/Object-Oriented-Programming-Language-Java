package org.ycpait.studentmanagementpp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.ycpait.studentmanagement.entity.Student;
import org.ycpait.studentmanagementapp.dao.impl.StudentDAOImpl;
import org.ycpait.studentmanagementpp.exception.StudentNotFoundException;

public class StudentManagementApplication {

	public static void main(String[] args) throws StudentNotFoundException {

		System.out.println("Number od Students register are" + Student.getCount());
		// Student s =null;
         StudentDAOImpl dao = new StudentDAOImpl();
		// Student[] students = new Student[2];
		//List<Student> students = new ArrayList<Student>();
		// System.out.println(students[0]);
		// System.out.println(students[1]);

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
			System.out.println("7.Students who have scored more than 90");
			System.out.println("8.Students who have scored more than 90 then give List of Names");
			System.out.println("-1. Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {

				sc.nextLine();

				System.out.print("Enter Student Name: ");

				String name = sc.nextLine();

				System.out.print("Enter Student Marks: ");

				float percent = sc.nextFloat();
				
				List<String> subjects = new ArrayList<String>();
				subjects.add("OS");
				subjects.add("Spring");

				Student s = new Student(name, percent,subjects);

				//students.add(s);

				System.out.println();

				System.out.println("Student registered successfully!");
				dao.save(s);

				break;

			}

			case 2: {

				if (dao.findAll().isEmpty()) {

					System.out.println("No students registered yet.");

				} else {

					System.out.println("\nRegistered Student Details:");

					System.out.println("============================");

					for (Student stu : dao.findAll()) {
                           
						System.out.println(stu);

					}

					System.out.println("============================");

					System.out.println("Total Students: " + dao.findAll().size());

				}

				break;

			}

			case 3: {

				
					System.out.print("Enter roll number: ");

					int r = sc.nextInt();

					try {
						Student searchedStudent = dao.findOne(r);
						System.out.println(searchedStudent);
						} catch (StudentNotFoundException e) {
						e.printStackTrace();
						}

						break;

			}

			case 4:
				System.out.println("Enter Roll Number to Delete");
				int rollNumberToDelete = sc.nextInt();

				dao.deleteOne(rollNumberToDelete);
				break;

			case 5: {

				Collections.sort(dao.findAll());

				System.out.println("\nSorted List of students:");

				System.out.println("============================");

				for (Student stu : dao.findAll()) {

					if (stu != null) {

						System.out.println(stu);

					}

				}

				break;

			}

			case 6:

				Collections.sort(dao.findAll(), (s1, s2) -> s1.getName().compareTo(s2.getName()));

				for (Student stu : dao.findAll()) {
					if (stu != null)
						System.out.println(stu);
				}
				break;

			case 7:
				             dao.findAll().stream()
				                      .filter(s -> s.getMarks() > 90)
				                      .toList()
				                      .forEach(s -> System.out.println(s));
				break;
			case 8:
				List<String> topScoringStudentNames = dao.findAll().stream()
				                                              .filter(s -> s.getMarks()>90)
						                                      .map(s -> s.getName()).toList();
				topScoringStudentNames.forEach(s -> System.out.println(s));

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