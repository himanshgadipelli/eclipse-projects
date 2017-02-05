package org.pradeep.javaperks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		
		Properties props = new Properties();
		try {
			props.load(new FileReader("config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String property = (String) props.getOrDefault("nani", "Hey it doesn't exist");
		
		System.out.println(property);
	}

}
 