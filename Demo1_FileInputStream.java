package com.sl.stream;

import java.io.FileInputStream;
import java.io.IOException;


public class Demo1_FileInputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("aaa.txt");
		int i;									//byte stream read()
		while((i = fis.read()) != -1) {			//return int value
			System.out.println(i);				//-1 represents end of file
		}
		fis.close();
		System.out.println("aaaaa");
	}

}
