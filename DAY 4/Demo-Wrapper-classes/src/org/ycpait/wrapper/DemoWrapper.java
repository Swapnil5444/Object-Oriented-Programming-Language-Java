package org.ycpait.wrapper;

public class DemoWrapper {

	public static void main(String[] args) {
		
		//primitive
		int i = 10;
		
		//primitive to wrapper
		//Integer iObj = new Integer(i);
		Integer iObj = i;//auto-boxing
		
		//wrapper to primitive
		int j = iObj.intValue();
		
		//===============================//
		
		//String to Primitive
		int p = Integer.parseInt("78");
		
		//Primitive to String
		String data = Integer.toString(p);
		
		//===============================//
		//String to Wrapper
		Integer o = Integer.valueOf("77");
		
		//Wrapper to String
		String str = o.toString();		
		
		
	}

}
