package com.sl.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4_CopyByArray {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("aaa.txt");
		FileOutputStream fos = new FileOutputStream("ccc.txt");
		byte[] b = new byte[3];
		int len;
		while((len = fis.read(b)) != -1) {
			fos.write(b, 0, len);
		}
		fis.close();
		fos.close();
	}

}
