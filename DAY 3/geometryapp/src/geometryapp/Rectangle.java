package geometryapp;

public class Rectangle extends Shape {
	
	private float length;
	private float breadth;
	
	public Rectangle(float length, float breadth,String color) {
		super(color);
		this.length = length;
		this.breadth = breadth;
		//this.color = color;
	}
	
	public float calculateArea() {
		return length*breadth;
	}
	
	//Method Overriding
	public void draw() {
		super.draw();
		System.out.println("With length  " + this.length +" With breadth " + this.breadth);
	}
	
	

}
