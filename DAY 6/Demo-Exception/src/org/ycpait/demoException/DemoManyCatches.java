package org.ycpait.demoException;

public class DemoManyCatches {

	public static void main(String[] args) {
		
		try {
			String s = null;
			System.out.println(s.length());
			System.out.println(args[0]);
			System.out.println(1/0);
		}
//		catch(ArithmeticException  e){
//			System.out.println("Cannot divide by Zero");
//		}
//		catch(NullPointerException e) {
//			System.out.println("Can not invoke method or null reference");
//		}
//		catch(ArrayIndexOutOfBoundsException arr) {
//			System.out.println("array index out of range");
//		}
		
		//Generic Catch 
		catch(Exception e) {
			System.out.println("Generic");
		}
		System.out.println("After");

	}

}
