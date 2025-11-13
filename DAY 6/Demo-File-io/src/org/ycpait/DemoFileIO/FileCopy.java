package org.ycpait.DemoFileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		FileInputStream fish = null;
		FileOutputStream f1 = null;
		try {
			fish = new FileInputStream("readme.txt");
			System.out.println("File Read Successfully!!!!");
			f1 = new FileOutputStream("creadme.txt");
		    int data = fish.read();
			while(data != -1) {
				System.out.print((char)data);
				data = fish.read();
				f1.write((char)data);                                                                                                                       
		} 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fish.close();
				f1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

  }
	
}
