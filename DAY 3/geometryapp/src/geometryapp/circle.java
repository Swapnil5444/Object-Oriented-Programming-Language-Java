package geometryapp;

public class circle extends Shape {
    
	//Attributes
	private float radius;
	
	
	//Constructor
	public circle(float radius, String color) {
		super(color);
		System.out.println("In Circle(float radius,String color)");
		this.radius = radius;
		//this.color = color;
	}
	
	//Methods
	public float calculateArea() {
		return 3.14f*radius*radius;
	}
	
	@Override //built-in annotations to check if overriding is appropriate
	          // it is recommended to annotate for overriden methods NOT mandate
	//overridden method
	//Method Overriding
	public void draw() {
		super.draw();
		System.out.println("With radius" + this.radius);
	}
}
