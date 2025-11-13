package org.ycpait.DemoFileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFileRead {

	public static void main(String[] args){
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("Readme.txt");
			System.out.println("File Found Successfully.");
			
			int data = fis.read();
			while(data != -1) {
				System.out.print((char)data);
				data = fis.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
