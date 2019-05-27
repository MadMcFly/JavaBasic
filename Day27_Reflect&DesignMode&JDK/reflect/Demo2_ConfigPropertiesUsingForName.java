package com.sl.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo2_ConfigPropertiesUsingForName {

	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));
		Class clazz = Class.forName(br.readLine());
		new Juicer().run((Fruit) clazz.newInstance());
	}

}

interface Fruit {
	public void squeeze();
}

class Apple implements Fruit {

	@Override
	public void squeeze() {
		System.out.println("this is your apple juice...");
	}
}

class Orange implements Fruit {

	@Override
	public void squeeze() {
		System.out.println("this is your orange juice...");
	}
}

class Juicer {
	public void run(Fruit f) {
		System.out.println("give me one second...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		f.squeeze();
	}
}