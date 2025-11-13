package org.ycpait.studentmanagementapp.dao.impl;

import java.security.DomainCombiner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ycpait.studentmanagement.entity.Student;
import org.ycpait.studentmanagementpp.exception.StudentNotFoundException;

public class StudentDAOImpl {

	private List<Student> students;
	
	public StudentDAOImpl() {
		this.students = new ArrayList<Student>();
	}
	
	public void save(Student s) {
		this.students.add(s);
	}
	
	public List<Student> findAll(){
		return students;
	}
	
	public Student findOne(int rollNumber) throws StudentNotFoundException {
	     for(Student foundStudent : students) {
	    	 if(foundStudent != null) {
	    		 if(foundStudent.getRollNumber() == rollNumber) {
	    			 //System.out.println(foundStudent);
	    			 return foundStudent;
	    			 }
	    		 }
	    	 }
	     // generate Exception
	     StudentNotFoundException e = new StudentNotFoundException("student with rollNumber " + rollNumber + " NOT FOUND");
	     throw e;
	     }
	
	public void deleteOne(int rollNumber) throws StudentNotFoundException {
		Iterator<Student> i = students.iterator();

		while(i.hasNext()) {
		Student studentTobeDeleted = i.next();
		if(studentTobeDeleted.getRollNumber() == rollNumber);
		i.remove();
		}
   }
}