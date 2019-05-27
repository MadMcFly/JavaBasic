package com.sl.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.properties"));
		Class clazz = Class.forName(br.readLine());
		Demo d = (Demo) clazz.newInstance();
		d.run();
	}

}
