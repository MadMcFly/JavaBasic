package com.sl.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo6_Chinese {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("aaa.txt");
		int len;
		byte[] arr = new byte[2];
		while((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr, 0, len));
		}
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("aaa.txt",true);
		fos.write("你好".getBytes());
		fos.close();
	}

}
