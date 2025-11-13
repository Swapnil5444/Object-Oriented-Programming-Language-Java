package org.ycpait.demoException;

public class DemoFinally {

	public static void main(String[] args) {
		
		try {
			System.out.println("In Try");
			System.out.println(1/0);
		}
		catch (Exception e) {
			System.out.println("In Catch");
		}
		finally {
			System.out.println("In Finally");
		}
	}

}
