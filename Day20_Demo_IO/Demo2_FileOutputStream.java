package com.sl.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("bbb.txt");
		fos.write(97);
		fos.write(11);
		fos.write(-1);
		fos.close();
		FileOutputStream fos1 = new FileOutputStream("bbb.txt", true);
		fos1.write(97);
		fos1.close();
	}

}
