package com.sl.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Test2 {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("a.txt"));
		System.setOut(new PrintStream("copy.txt"));
		InputStream is = System.in;
		PrintStream ps = System.out;
		
		byte[] arr = new byte[1024];
		int len;
		
		while((len = is.read(arr)) != -1) {
			ps.write(arr, 0, len);
		}
		
		is.close();
		ps.close();
	}

}
