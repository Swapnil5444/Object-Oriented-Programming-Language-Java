package geometryapp;

public class GeometryApplication {

	public static void main(String[] args) {
		circle c = new circle(5,"Red");
		System.out.println("Area of Circle:"+c.calculateArea());
		c.draw();
		
		System.out.println();
		 
		Rectangle r = new Rectangle(5f,10f,"Blue");
		System.out.println("Area of Rectangle:"+r.calculateArea());
		r.draw();
	
	}

}
