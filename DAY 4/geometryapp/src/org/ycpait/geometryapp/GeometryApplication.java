package org.ycpait.geometryapp;

import org.ycpait.geometryapp.entity.Rectangle;
import org.ycpait.geometryapp.entity.Shape;
import org.ycpait.geometryapp.entity.circle;

public class GeometryApplication {

	public static void main(String[] args) {
		
		Shape s; // References of abstract class is created
     	circle c = new circle(5,"Red");
     	
     	s = c; //upcasting
     	
     	//s = new Shape();// cannot be instantiate abstract class.
		  //ERROR
     	
		System.out.println("Area of Circle:"+c.calculateArea());
		c.draw();
		
		//invoking generalized method
		s.calculateArea();
		s.draw();
		
		//invoking specialized method
		circle c1 = (circle)s; // downcasting
		c1.getPi();
		
		System.out.println();
		 
		Rectangle r = new Rectangle(5f,10f,"Blue");
		System.out.println("Area of Rectangle:"+r.calculateArea());
		r.draw();
		System.out.println("Area of Rectangle:"+r.calculateArea());
		s.draw();
	
	}

}
