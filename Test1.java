package com.sl.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("d.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] arr = new byte[5];
		
		int len;
		while((len = fis.read(arr)) != -1) {
			baos.write(arr,0,len);		//don't write write(len)!!!!
		}
		
		fis.close();
		System.out.println(new String(baos.toByteArray()));
	}

}
