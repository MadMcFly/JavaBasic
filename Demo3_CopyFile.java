package com.sl.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_CopyFile {

	public static void main(String[] args) throws IOException {
//		demo1();
		FileInputStream fis = new FileInputStream("sunset.png");
		FileOutputStream fos = new FileOutputStream("copy.png");
		
		byte[] b = new byte[fis.available()];
		fis.read(b);
		fos.write(b);
		fis.close();
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("sunset.png");
		FileOutputStream fos = new FileOutputStream("copy.png");
		
		int i = 0;
		while((i = fis.read()) != -1) {
			fos.write(i);
		}
		fis.close();
		fos.close();
	}

}
