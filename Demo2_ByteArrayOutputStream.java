package com.sl.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2_ByteArrayOutputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("d.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int b;
		while((b = fis.read()) != -1) {
			baos.write(b);
		} 
		fis.close();
		System.out.println(new String(baos.toByteArray()));
		System.out.println(baos.toString());
	}

}
