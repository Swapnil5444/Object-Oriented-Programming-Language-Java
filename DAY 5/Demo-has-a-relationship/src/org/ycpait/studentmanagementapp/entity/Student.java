package org.ycpait.studentmanagementapp.entity;

public class Student {

	private int rollNumber;
	
	//has a relationship
	private Address postalAddress;
	
	//
	private Trainer instructor;

	//Constructor
	public Student(int rollNumber, Address postalAddress) {
		super();
		this.rollNumber = rollNumber;
		this.postalAddress = postalAddress;
	}
	
	//Setter and Getter
	public Trainer getInstructor() {
		return instructor;
	}

	public void setInstructor(Trainer instructor) {
		this.instructor = instructor;
	}
	
	
	
	
	

}
