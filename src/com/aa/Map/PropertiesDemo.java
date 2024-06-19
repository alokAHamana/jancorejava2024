package com.aa.Map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		Properties pr = new Properties();

		FileInputStream fis = new FileInputStream("C:\\Users\\aloka\\Desktop\\properties.txt");

		pr.load(fis);
		System.out.println(pr);
		
		// if we want to get only user name
		String s = pr.getProperty("User");
		System.out.println(s);
		
		//if we want to save data to any file location by java code
		
		pr.setProperty("User", "alok");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\aloka\\Desktop\\properties.txt");

		pr.store(fos, "Updated by alok");
		//System.out.println(fos);
	}
}
