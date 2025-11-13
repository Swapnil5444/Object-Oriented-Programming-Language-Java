package geometryapp;

public class Shape {
	
	protected String color;
	
	public Shape(String color) {
		super();
		System.out.println("In Shape(String color)");
		this.color =color;
	}
	
	public void draw() {
		System.out.println("Shape Drawn using color" + this.color);
	}

}
