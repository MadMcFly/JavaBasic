package com.sl.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class Demo11_Properties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
//		dmeo1();
//		demo2();
		Properties prop = new Properties();
		prop.load(new FileInputStream("config.properties"));
		System.out.println(prop); 							//using hashtable, disorder
		prop.setProperty("gender", "male");
		System.out.println(prop.getProperty("gender"));
		prop.store(new FileOutputStream("config.properties"), "gender changed");
	}

	private static void demo2() {
		Properties prop = new Properties();
		prop.setProperty("name", "alice");
		prop.setProperty("age", "12");
		
		//keySet() return Set<Object>, since no generic K is specified
		Set<Object> set = prop.keySet();
		for (Object object : set) {
			System.out.println(object + ": " + prop.get(object));
		}
		
		//stringPropertyNames return Set<String>
		Set<String> set1 = prop.stringPropertyNames();
		for (String string : set1) {
			System.out.println(string + prop.getProperty(string));
		}
		
		//propertyNames return Enumeration<?>
		Enumeration<String> en = (Enumeration<String>) prop.propertyNames();
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			System.out.println(key + "= " + prop.getProperty(key));
		}
	}

	private static void dmeo1() {
		Properties prop = new Properties();
		prop.put("asd", "123");
		System.out.println(prop);
	}

}
