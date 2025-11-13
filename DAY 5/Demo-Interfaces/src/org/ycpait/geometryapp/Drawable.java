package org.ycpait.geometryapp;

interface Printable {
	void print();
	static void of() {}
	
	default void printFormat() {
		System.out.println("default printFormat");
	}

}

public interface Drawable{
	//public static final int PX=1;
	int PX =1;
	//static final int PX =1;
	//public final int PX =1;
	
	void draw();
}


class Circle implements Drawable,Printable {
	
	@Override
	public void draw() {
		System.out.println(PX);
	}
	
	public void print() {}
	
	public void printFormat() {}
}

class Main{
	public static void main(String[] args) {
		Drawable d;
		
	}
}