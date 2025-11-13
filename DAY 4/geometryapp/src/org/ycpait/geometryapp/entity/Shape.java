package org.ycpait.geometryapp.entity;

public abstract class Shape {
	
	protected String color;
	
	
	public Shape(String color) {
		super();
		System.out.println("In Shape(String color)");
		this.color =color;
	}
	
	public abstract float calculateArea();
	public void draw() {
		System.out.println("Shape Drawn using color" + this.color);
	}

}
