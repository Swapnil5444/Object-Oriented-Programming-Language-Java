package org.ycpait.demoException;

import java.io.IOException;

public class DemoThrows {

	public static void main(String[] args) throws IOException {
		
		IOException e = new IOException();
		
		//Handling Exception
//		try {
//			throw e;
//		}
//		catch(IOException ex) {
//			
//		}
		try {
		readFile();
		}
		catch(IOException e1) {
			
		}
	}
	
	
	static void readFile() throws IOException{
		IOException e = new IOException();
		throw e;
	}

}
